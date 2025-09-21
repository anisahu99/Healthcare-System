package com.healthcare.doctor_service.service;

import com.healthcare.doctor_service.dto.request.DoctorRequest;
import com.healthcare.doctor_service.dto.response.DoctorResponse;
import com.healthcare.doctor_service.entity.Doctor;
import com.healthcare.doctor_service.entity.Slot;
import com.healthcare.doctor_service.service.grpc.*;
import com.healthcare.doctor_service.service.DoctorService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.grpc.server.service.GrpcService;

import java.util.Collections;
import java.util.List;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.google.protobuf.Timestamp;
import com.google.protobuf.Duration;

@GrpcService
@RequiredArgsConstructor
public class DoctorServiceImpl extends DoctorServiceGrpc.DoctorServiceImplBase {
    private final DoctorService doctorService;

    @Override
    public void getDoctors(Empty request, StreamObserver<DoctorList> doctorListStreamObserver){
        try{
            List<Doctor> doctorList = doctorService.getDoctor();
            System.out.println("1");

            List<com.healthcare.doctor_service.service.grpc.Doctor> grpcDoctors = new ArrayList<>();

            for(Doctor doctor: doctorList){
                List<Slot> slots = doctor.getAvailabilitySlots();
                if (slots == null) slots = Collections.emptyList();
                List<com.healthcare.doctor_service.service.grpc.Slot> grpcSlots = new ArrayList<>();
                System.out.println("2");

                for(Slot s : slots){
                    com.healthcare.doctor_service.service.grpc.Slot grpcSlot = com.healthcare.doctor_service.service.grpc.Slot.newBuilder()
                            .setSlotId(s.getSlotId())
                            .setStartTime(convertToTimestamp(s.getStartTime()))
                            .setEndTime(convertToTimestamp(s.getEndTime()))
                            .setBooked(s.isBooked())
                            .build();

                    grpcSlots.add(grpcSlot);
                }
                com.healthcare.doctor_service.service.grpc.Doctor doctorGrpc =
                        com.healthcare.doctor_service.service.grpc.Doctor.newBuilder()
                                .setDoctorId(doctor.getDoctorId())
                                .setFirstName(doctor.getFirstName())
                                .setLastName(doctor.getLastName())
                                .setSpecialization(doctor.getSpecialization())
                                .setCountryCode(doctor.getCountryCode())
                                .setPhoneNumber(doctor.getPhoneNumber())
                                .addAllAvailabilitySlots(grpcSlots)
                                .build();

                grpcDoctors.add(doctorGrpc);
                System.out.println("doctor: ");
            }

            DoctorList response = DoctorList.newBuilder()
                    .addAllDoctors(grpcDoctors)
                    .build();

            doctorListStreamObserver.onNext(response);
            doctorListStreamObserver.onCompleted();

        } catch (Exception e) {
            System.out.println("Catch: "+ e.getMessage());
            doctorListStreamObserver.onError(e);
        }
    }
    @Override
    public void createDoctor(CreateDoctorRequest request, StreamObserver<CreateDoctorResponse> responseStreamObserver){
        try{
            DoctorRequest r = new DoctorRequest()
                    .setFirstName(request.getFirstName())
                    .setLastName(request.getLastName())
                    .setSpecialization(request.getSpecialization())
                    .setCountryCode(request.getCountryCode())
                    .setPhoneNumber(request.getPhoneNumber());

            DoctorResponse doctorResponse =  doctorService.createDoctor(r);
            CreateDoctorResponse doctorResponseGrpc = CreateDoctorResponse.newBuilder()
                    .setDoctorId(doctorResponse.getDoctorId())
                    .setFullName(doctorResponse.getFullName())
                    .setSpecialization(doctorResponse.getSpecialization())
                    .setPhoneNumber(doctorResponse.getPhoneNumber())
                    .build();

            responseStreamObserver.onNext(doctorResponseGrpc);
            responseStreamObserver.onCompleted();
        }catch (Exception e){
            responseStreamObserver.onError(e);
        }
    }

    @Override
    public void getDoctorsBySpecialization(Specialization request, StreamObserver<DoctorList> doctorListStreamObserver){
        try{
            List<Doctor> doctorList = doctorService.getDoctorBySpecialization(request.getSpecialization());

            List<com.healthcare.doctor_service.service.grpc.Doctor> grpcDoctors = new ArrayList<>();

            for(Doctor doctor: doctorList){
                List<Slot> slots = doctor.getAvailabilitySlots();
                List<com.healthcare.doctor_service.service.grpc.Slot> grpcSlots = new ArrayList<>();

                for(Slot s : slots){
                    com.healthcare.doctor_service.service.grpc.Slot grpcSlot = com.healthcare.doctor_service.service.grpc.Slot.newBuilder()
                            .setSlotId(s.getSlotId())
                            .setStartTime(convertToTimestamp(s.getStartTime()))
                            .setEndTime(convertToTimestamp(s.getEndTime()))
                            .setBooked(s.isBooked())
                            .build();

                    grpcSlots.add(grpcSlot);
                }
                com.healthcare.doctor_service.service.grpc.Doctor doctorGrpc =
                        com.healthcare.doctor_service.service.grpc.Doctor.newBuilder()
                                .setDoctorId(doctor.getDoctorId())
                                .setFirstName(doctor.getFirstName())
                                .setLastName(doctor.getLastName())
                                .setSpecialization(doctor.getSpecialization())
                                .setCountryCode(doctor.getCountryCode())
                                .setPhoneNumber(doctor.getPhoneNumber())
                                .addAllAvailabilitySlots(grpcSlots)
                                .build();

                grpcDoctors.add(doctorGrpc);
            }

            DoctorList response = DoctorList.newBuilder()
                    .addAllDoctors(grpcDoctors)
                    .build();
            doctorListStreamObserver.onNext(response);
            doctorListStreamObserver.onCompleted();
        } catch (Exception e) {
            doctorListStreamObserver.onError(e);
        }
    }

    public Timestamp convertToTimestamp(LocalDateTime localDateTime) {
        Instant instant = localDateTime.toInstant(ZoneOffset.UTC);
        return Timestamp.newBuilder()
                .setSeconds(instant.getEpochSecond())
                .setNanos(instant.getNano())
                .build();
    }

    public java.time.Duration toJavaDuration(Duration duration) {
        return java.time.Duration.ofSeconds(duration.getSeconds(), duration.getNanos());
    }

    public LocalDateTime toLocalDateTime(Timestamp timestamp) {
        return LocalDateTime.ofInstant(
                Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos()),
                ZoneOffset.UTC
        );
    }
}

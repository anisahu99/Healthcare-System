package com.healthcare.doctor_service.service;

import com.healthcare.doctor_service.dto.response.SlotResponse;
import com.healthcare.doctor_service.entity.Slot;
import com.healthcare.doctor_service.service.grpc.*;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.grpc.server.service.GrpcService;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.Timestamp;
import com.google.protobuf.Duration;

@GrpcService
@RequiredArgsConstructor
public class AvailableServiceImpl extends AvailableServiceGrpc.AvailableServiceImplBase {
    private final AvailabilityService availabilityService;

    @Override
    public void getAvailability(GetAvailabilityRequest request, StreamObserver<SlotList>slotListStreamObserver) {
        try{
            List<Slot> response = availabilityService.getAvailability(request.getDoctorId());
            List<com.healthcare.doctor_service.service.grpc.Slot> grpcSlots = new ArrayList<>();


            for (Slot s : response){
                com.healthcare.doctor_service.service.grpc.Slot grpcSlot= com.healthcare.doctor_service.service.grpc.Slot.newBuilder()
                        .setSlotId(s.getSlotId())
                        .setStartTime(convertToTimestamp(s.getStartTime()))
                        .setEndTime(convertToTimestamp(s.getEndTime()))
                        .build();
                grpcSlots.add(grpcSlot);
            }
            SlotList slotList = SlotList.newBuilder()
                    .addAllSlots(grpcSlots)
                    .build();
            slotListStreamObserver.onNext(slotList);
            slotListStreamObserver.onCompleted();
        } catch (Exception e) {
            slotListStreamObserver.onError(e);
        }
    }

    @Override
    public void addAvailability(AddAvailabilityRequest request,
                                StreamObserver<AddAvailabilityResponse> responseStreamObserver) {
        try {
            System.out.println("In grpc");
            SlotResponse response = availabilityService.addAvailability(request.getDoctorId(), toLocalDateTime(request.getStartTime()), toJavaDuration(request.getDuration()));
            AddAvailabilityResponse grpcResponse = AddAvailabilityResponse.newBuilder()
                    .setSlotId(response.getSlotId())
                    .setStartTime(convertToTimestamp(response.getStartTime()))
                    .setEndTime(convertToTimestamp(response.getEndTime()))
                    .build();
            responseStreamObserver.onNext(grpcResponse);
            responseStreamObserver.onCompleted();
        } catch (Exception e) {
            responseStreamObserver.onError(e);
        }
    }


    @Override
    public void bookSlot(BookSlotRequest request, StreamObserver<BookSlotResponse>bookSlotResponseStreamObserver){
        try{
            Boolean exist = availabilityService.bookSlot(request.getSlotId());
            BookSlotResponse grpcResponse = BookSlotResponse.newBuilder()
                    .setExist(exist)
                    .build();

            bookSlotResponseStreamObserver.onNext(grpcResponse);
            bookSlotResponseStreamObserver.onCompleted();
        } catch (Exception e) {
            bookSlotResponseStreamObserver.onError(e);
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

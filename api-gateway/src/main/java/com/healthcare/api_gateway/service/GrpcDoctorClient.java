package com.healthcare.api_gateway.service;

import com.healthcare.api_gateway.service.grpc.*;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GrpcDoctorClient {
    @GrpcClient("doctor-service")
    private DoctorServiceGrpc.DoctorServiceBlockingStub doctorServiceBlockingStub;

    @GrpcClient("availability-service")
    private AvailableServiceGrpc.AvailableServiceBlockingStub availableServiceBlockingStub;

    // Call doctor service

    // Get All Doctors
    public DoctorList getAllDoctors(){
        return doctorServiceBlockingStub.getDoctors(Empty.newBuilder().build());
    }

    // Get Doctor with specialization
    public DoctorList getDoctorsBySpecialization(String specialization){
        return doctorServiceBlockingStub.getDoctorsBySpecialization(Specialization.newBuilder().setSpecialization(specialization).build());
    }

    // Add Doctor --> Need to test
    public CreateDoctorResponse createDoctor(CreateDoctorRequest request){
        return doctorServiceBlockingStub.createDoctor(request);
    }

    // Call availability service
    public SlotList getAvailability(String doctorId){
        return availableServiceBlockingStub.getAvailability(
                GetAvailabilityRequest.newBuilder().setDoctorId(doctorId).build()
        );
    }

    public BookSlotResponse bookSlot(long slotId){
        return availableServiceBlockingStub.bookSlot(BookSlotRequest.newBuilder().setSlotId(slotId).build());
    }

    // Add Availability
    public AddAvailabilityResponse addAvailability(AddAvailabilityRequest request){
        return availableServiceBlockingStub.addAvailability(request);
    }
}

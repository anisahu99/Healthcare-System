package com.healthcare.api_gateway.controller;

import com.healthcare.api_gateway.service.GrpcDoctorClient;
import com.healthcare.api_gateway.service.grpc.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DoctorController {

    private final GrpcDoctorClient grpcClient;

    @GetMapping("/doctors")
    // We facing conversion error earlier because of misMatch between what implemented function return and what function return we define
    public DoctorList getDoctors() {
        return grpcClient.getAllDoctors();
    }

    @GetMapping("/doctors/specialization/{spec}")
    public DoctorList getDoctorsBySpecialization(@PathVariable String spec) {
        return grpcClient.getDoctorsBySpecialization(spec);
    }

    @PostMapping("/doctors")
    public CreateDoctorResponse createDoctor(CreateDoctorRequest request){
        System.out.println("request.firstName"+request.getFirstName()+"x");
        System.out.println("request.lastName"+request.getLastName());
        System.out.println("request.specialization"+request.getSpecialization());
        System.out.println("request.code"+request.getCountryCode());
        System.out.println("request.number"+request.getPhoneNumber());
        return grpcClient.createDoctor(request);
    }

    @GetMapping("/availability/{doctorId}")
    public SlotList getAvailability(@PathVariable String doctorId) {
        return grpcClient.getAvailability(doctorId);
    }

    @PostMapping("/availability/book/{slotId}")
    public BookSlotResponse bookSlot(@PathVariable long slotId) {
        return grpcClient.bookSlot(slotId);
    }

    @PostMapping("/availability")
    public AddAvailabilityResponse addAvailability(AddAvailabilityRequest request){
        return grpcClient.addAvailability(request);
    }


}

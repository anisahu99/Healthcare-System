package com.healthcare.doctor_service.controller;

import com.healthcare.doctor_service.dto.request.AvailabilityRequest;
import com.healthcare.doctor_service.dto.request.DoctorRequest;
import com.healthcare.doctor_service.dto.response.DoctorResponse;
import com.healthcare.doctor_service.dto.response.SlotResponse;
import com.healthcare.doctor_service.service.AvailabilityService;
import com.healthcare.doctor_service.service.DoctorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;
    private final AvailabilityService availabilityService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DoctorResponse createDoctor(@RequestBody @Valid DoctorRequest request){
        return doctorService.createDoctor(request);
    }

    @PostMapping("/{doctorId}/availability")
    public SlotResponse addAvailability(@PathVariable String doctorId, @RequestBody @Valid AvailabilityRequest request){
        return availabilityService.addAvailability(doctorId, request.getStartTime(), request.getDuration());
    }
}

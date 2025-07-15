package com.healthcare.doctor_service.controller;

import com.healthcare.doctor_service.dto.request.AvailabilityRequest;
import com.healthcare.doctor_service.dto.request.DoctorRequest;
import com.healthcare.doctor_service.dto.response.DoctorResponse;
import com.healthcare.doctor_service.dto.response.SlotResponse;
import com.healthcare.doctor_service.entity.Doctor;
import com.healthcare.doctor_service.entity.Slot;
import com.healthcare.doctor_service.service.AvailabilityService;
import com.healthcare.doctor_service.service.DoctorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;
    private final AvailabilityService availabilityService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DoctorResponse createDoctor(@RequestBody @Valid DoctorRequest request){

        try{
            return doctorService.createDoctor(request);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Doctor> getDoctor(){

        try{
            return doctorService.getDoctor();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{specialization}")
    @ResponseStatus(HttpStatus.OK)
    public List<Doctor> getDoctor(@PathVariable String specialization){
        try{
            return doctorService.getDoctorBySpecialization(specialization);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @PostMapping("/{doctorId}/availability")
    @ResponseStatus(HttpStatus.CREATED)
    public SlotResponse addAvailability(@PathVariable String doctorId, @RequestBody @Valid AvailabilityRequest request){

        try{
            return availabilityService.addAvailability(doctorId, request.getStartTime(), request.getDuration());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("{doctorId}/availability")
    @ResponseStatus(HttpStatus.OK)
    public List<Slot> getAvailability(@PathVariable String doctorId){

        try{
            return availabilityService.getAvailability(doctorId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PatchMapping("/{slotId}/availability")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean bookSlot(@PathVariable String slotId){
        try {
            return availabilityService.bookSlot(Long.valueOf(slotId));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

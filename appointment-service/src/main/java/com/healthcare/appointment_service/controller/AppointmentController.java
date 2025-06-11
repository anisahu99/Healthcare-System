package com.healthcare.appointment_service.controller;

import com.healthcare.appointment_service.dto.AppointmentRequest;
import com.healthcare.appointment_service.model.*;
import com.healthcare.appointment_service.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointments")
@RequiredArgsConstructor
public class AppointmentController {
    private final AppointmentService service;

    @PostMapping
    public Appointment bookAppointment(@RequestBody AppointmentRequest request) {
        return service.bookAppointment(request);
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Appointment Service is UP!";
    }

//    @GetMapping("/{id}")
//    public Appointment getAppointment(@PathVariable Long id){
//        return appointmentService.getAppointmentById(id);   // abhi implement karna hai
//    }

}
package com.healthcare.appointment_service.controller;


import com.healthcare.appointment_service.dto.SlotRequest;
import com.healthcare.appointment_service.model.Appointment;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.healthcare.appointment_service.service.SlotService;

@RestController
@RequestMapping("/api/slots")
@RequiredArgsConstructor
public class SlotController {
    private final SlotService slotService;
    @PostMapping("/book")
    public Appointment bookSlot(@RequestBody @Valid SlotRequest request){
        try {
            return slotService.bookSlot(request);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/health")
    public String healthCheck() {
        return "Appointment Service is UP!";
    }

}

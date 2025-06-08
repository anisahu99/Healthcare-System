package com.healthcare.appointment_service.dto;

import lombok.Data;
import java.time.LocalDateTime;
import lombok.Getter;
@Getter
@Data
public class AppointmentRequest {
    private String patientId;
    private String doctorId;
    private LocalDateTime appointmentTime;
    private String slot; // For Redis lock key
}
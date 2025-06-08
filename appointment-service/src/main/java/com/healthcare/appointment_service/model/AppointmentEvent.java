package com.healthcare.appointment_service.model;

import lombok.*;

import java.time.LocalDateTime;

@Data @NoArgsConstructor @AllArgsConstructor
public class AppointmentEvent {
    private String eventId;
    private String patientId;
    private String doctorId;
    private LocalDateTime appointmentTime;
    private String eventType; // CREATED, UPDATED, CANCELLED
}
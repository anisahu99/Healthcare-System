package com.healthcare.appointment_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SlotEvent {
    private String eventId;
    private String doctorId;
    private LocalDateTime slotStart;
    private String status; // BOOKED, CANCELLED, COMPLETED
                                                // Run scheduler when appointment gets completed or cancelled
                                                // Case when patient not reached to the doctor
}

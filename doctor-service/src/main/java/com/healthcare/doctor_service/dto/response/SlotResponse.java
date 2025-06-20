package com.healthcare.doctor_service.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data @Setter @Getter @Accessors(chain = true)
public class SlotResponse {
    private Long slotId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}

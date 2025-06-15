package com.healthcare.appointment_service.messaging;

import com.healthcare.appointment_service.model.SlotEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SlotEventPublisher {
    private final KafkaTemplate<String, SlotEvent> kafkaTemplate;

    public void publishSlotEvent(SlotEvent event){
        kafkaTemplate.send("slots-booked-events",event);
    }
}

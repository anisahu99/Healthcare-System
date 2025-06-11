package com.healthcare.appointment_service.messaging;

import com.healthcare.appointment_service.model.AppointmentEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentEventPublisher {
    private final KafkaTemplate<String, AppointmentEvent> kafkaTemplate;

    public void publishEvent(AppointmentEvent event){
        kafkaTemplate.send("appointment-events", event);
    }
}

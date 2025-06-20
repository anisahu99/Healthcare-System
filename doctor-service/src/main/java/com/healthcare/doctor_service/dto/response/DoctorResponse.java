package com.healthcare.doctor_service.dto.response;

import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data @Setter @Accessors(chain = true)
public class DoctorResponse {
    private String doctorId;
    private String fullName;
    private String specialization;
}

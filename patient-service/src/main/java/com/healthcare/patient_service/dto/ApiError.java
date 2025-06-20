package com.healthcare.patient_service.dto;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Accessors(chain = true)
public class ApiError {
    private String code;
    private Object message;
    private boolean success;

}

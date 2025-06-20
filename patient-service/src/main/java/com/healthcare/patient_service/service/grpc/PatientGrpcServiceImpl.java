package com.healthcare.patient_service.service.grpc;


import com.healthcare.patient_service.entity.Patient;
import com.healthcare.patient_service.exception.PatientNotFoundException;
import com.healthcare.patient_service.repository.PatientRepository;


import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
public class PatientGrpcServiceImpl extends PatientServiceGrpc.PatientServiceImplBase{
    private final PatientRepository patientRepository;

    @Override
    public void getPatient(PatientRequest request, StreamObserver<PatientResponse> responseStreamObserver){
        Patient patient = patientRepository.findById(request.getId())
                .orElseThrow(() -> new PatientNotFoundException("Patient not found with ID: " + request.getId()));

        PatientResponse response = PatientResponse.newBuilder()
                .setPatientId(patient.getPatientId())
                .setFullName(patient.getFirstName()+" "+patient.getLastName())
                .setContactNumber(patient.getContactNumber())
                .setMedicalHistory(patient.getMedicalHistory())
                .build();

        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }
}


package com.aitmansour.pharmacymanagementsystem.service;

import com.aitmansour.pharmacymanagementsystem.io.entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    Patient createPatient(Patient patient);
    Patient getPatientById(String patientId);
    Patient getPatientByName(String name);
    Patient updatePatientDetails(String patientId, Patient patient);
    void deletePatient(String patientId);
    List<Patient> getPatient();
}

package com.aitmansour.pharmacymanagementsystem.io.repos;

import com.aitmansour.pharmacymanagementsystem.io.entity.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
    Patient findByPatientId(String patientId);

}

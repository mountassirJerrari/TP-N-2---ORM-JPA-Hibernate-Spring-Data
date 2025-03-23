package com.tp2.demo.repository;

import com.tp2.demo.entities.Patient;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {


    List<Patient> findByNomContains(String mc);
}

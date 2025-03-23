package com.tp2.demo.repository;

import com.tp2.demo.entities.Consultation;
import com.tp2.demo.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {


}

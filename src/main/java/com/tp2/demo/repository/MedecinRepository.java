package com.tp2.demo.repository;

import com.tp2.demo.entities.Medecin;
import com.tp2.demo.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {


}

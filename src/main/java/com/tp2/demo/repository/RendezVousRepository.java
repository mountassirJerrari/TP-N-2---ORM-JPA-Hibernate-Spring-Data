package com.tp2.demo.repository;

import com.tp2.demo.entities.Medecin;
import com.tp2.demo.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {


}

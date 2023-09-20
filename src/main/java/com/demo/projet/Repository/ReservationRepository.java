package com.demo.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.projet.Modele.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    
}

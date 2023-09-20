package com.demo.projet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.projet.Modele.Reservation;
import com.demo.projet.Repository.ReservationRepository;

@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository reservRepo;

    public Reservation addReservation(Reservation reservation) {
        return this.reservRepo.save(reservation);
    }

    public List<Reservation> findAllReservations() {
        return this.reservRepo.findAll();
    }
}

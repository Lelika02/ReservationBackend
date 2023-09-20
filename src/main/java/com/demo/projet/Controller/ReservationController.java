package com.demo.projet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.projet.Modele.Reservation;
import com.demo.projet.Service.ReservationService;

@RestController
public class ReservationController {
    
    @Autowired
    private ReservationService reservationService;

    @PostMapping("/reservation")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @GetMapping("/reservations")
    public List<Reservation> findAllReservation() {
        return reservationService.findAllReservations();
    }
}

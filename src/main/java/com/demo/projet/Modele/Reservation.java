package com.demo.projet.Modele;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dateDebut", nullable = false)
    private Date dateDebut;

    @Column(name = "dateFin", nullable = false)
    private Date dateFin;

    @Column(name = "nbAdulte")
    private int nbAdulte;

    @Column(name = "nbEnfant")
    private int nbEnfant;

    public Reservation() {

    }

    public Reservation(Date dateDebut, Date dateFin, int nbAdulte, int nbEnfant) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbAdulte = nbAdulte;
        this.nbEnfant = nbEnfant;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    public Date getDateFin() {
        return dateFin;
    }
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    public int getNbAdulte() {
        return nbAdulte;
    }
    public void setNbAdulte(int nbAdulte) {
        this.nbAdulte = nbAdulte;
    }
    public int getNbEnfant() {
        return nbEnfant;
    }
    public void setNbEnfant(int nbEnfant) {
        this.nbEnfant = nbEnfant;
    }
    
}

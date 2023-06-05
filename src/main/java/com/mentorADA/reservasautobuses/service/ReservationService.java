package com.mentorADA.reservasautobuses.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mentorADA.reservasautobuses.entity.Reservation;

public interface ReservationService {
	
	Reservation createReservation(Reservation reservationDTO);

    Reservation updateReservation(String id, Reservation reservationDTO);

    Reservation getReservationById(String id);

    void deleteReservation(String id);

    List<Reservation> getAllReservations();
    
}

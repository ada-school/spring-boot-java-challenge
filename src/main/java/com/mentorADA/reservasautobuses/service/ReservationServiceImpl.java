package com.mentorADA.reservasautobuses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.mentorADA.reservasautobuses.entity.Reservation;
import com.mentorADA.reservasautobuses.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(String id, Reservation reservation) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(id);
        if (optionalReservation.isPresent()) {
            Reservation existingReservation = optionalReservation.get();
            existingReservation.setName(reservation.getName());
            existingReservation.setEmail(reservation.getEmail());
            existingReservation.setOrigin(reservation.getOrigin());
            existingReservation.setDestination(reservation.getDestination());
            existingReservation.setDepartureDateTime(reservation.getDepartureDateTime());
            existingReservation.setDuration(reservation.getDuration());
            return reservationRepository.save(existingReservation);
        }
        return null;
    }

    @Override
    public Reservation getReservationById(String id) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(id);
        return optionalReservation.orElse(null);
    }

    @Override
    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }	 	
}

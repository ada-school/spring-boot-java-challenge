package com.mentorADA.reservasautobuses.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mentorADA.reservasautobuses.entity.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, String> {

}
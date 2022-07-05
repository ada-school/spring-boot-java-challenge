package com.example.bus_tickets.booking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> findById(String id) {
        return bookingRepository.findById(id);
    }

    public Booking insert(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking update(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void delete(Booking booking) {
        bookingRepository.delete(booking);
    }

    public void delete(String id) {
        Booking booking = new Booking();
        booking.setId(id);
        bookingRepository.delete(booking);
    }

}

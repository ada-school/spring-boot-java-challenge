package com.example.bus_tickets.booking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping
    public List<Booking> all() {
        return bookingService.findAll();
    }

    @PostMapping
    public Booking insert(@RequestBody Booking booking) {
        // Date format yyyy-MM-ddThh:mm:ss
        return bookingService.insert(booking);
    }

    @GetMapping("/{id}")
    public Optional<Booking> getById(@PathVariable String id) {
        Optional<Booking> booking = bookingService.findById(id);
        if (booking.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Booking not found with id: " + id + " (CODE 404)");
        return booking;
    }

    @PutMapping
    public Booking update(@RequestBody Booking booking) {
        return bookingService.update(booking);
    }

    @DeleteMapping
    public void delete(@RequestBody Booking booking) {
        bookingService.delete(booking);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        bookingService.delete(id);
    }

}

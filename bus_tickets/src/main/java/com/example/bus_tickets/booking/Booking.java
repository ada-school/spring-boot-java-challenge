package com.example.bus_tickets.booking;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookings")
public class Booking {

    @Id
    private String id;
    private String name;
    private String email;
    private String origin;
    private String destination;
    private Date departureTime;
    private Integer durationMinutes;

    public Booking(){}
    /*
     * public Booking(String name, String email, String origin, String destination,
     * Date departureTime,
     * Duration duration) {
     * this.name = name;
     * this.email = email;
     * this.origin = origin;
     * this.destination = destination;
     * this.departureTime = departureTime;
     * this.duration = duration;
     * }
     */

    public Booking(String id, String name, String email, String origin, String destination, Date departureTime,
            Integer durationMinutes) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.durationMinutes = durationMinutes;
    }

    // #region Setters-Getters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setDurationMinutes(Integer duration) {
        this.durationMinutes = duration;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }
    // #endregion

}

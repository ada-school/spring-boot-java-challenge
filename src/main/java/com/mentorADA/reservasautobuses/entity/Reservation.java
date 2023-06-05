package com.mentorADA.reservasautobuses.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;


@Document(collection = "reservations")
public class Reservation {
    @Id
    private String id;
    private String name;
    private String email;
    private String origin;
    private String destination;
    private Date departureDateTime;
    private int duration;

    
    public Reservation() {
    }

    public Reservation(String name, String email, String origin, String destination, Date departureDateTime, int duration) {
        this.name = name;
        this.email = email;
        this.origin = origin;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.duration = duration;
    }

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
 
    @Override
    public String toString() {
        return "Reservation{" +
                " id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDateTime=" + departureDateTime +
                ", duration=" + duration +
                '}';
    }
}

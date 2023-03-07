package com.example.BookMyShow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {

    private String id;

    private int price;

    private String movieName;

    private String showTimings;

    //private List<> bookedSeats;

    private String showDate;

    private String theaterName;





    //Mappings





    //Constructors





    //Getters and Setters
}

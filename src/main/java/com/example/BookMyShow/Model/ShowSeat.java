package com.example.BookMyShow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="showSeat")
public class ShowSeat {

    private boolean isBooked;

    private int price;

    private String seatNo;

    private String bookedAt;

    private String seatType;


}

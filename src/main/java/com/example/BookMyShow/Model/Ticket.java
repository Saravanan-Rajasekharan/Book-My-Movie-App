package com.example.BookMyShow.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name="ticket")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String movieName;

    private LocalTime showTime;

    private LocalDate showDate;

    private int totalAmount;

    private String ticketId = UUID.randomUUID().toString();

    private String theaterName;

    //Ticket is child wrt user
    @JoinColumn
    @ManyToOne
    private User user;

    //Ticket is child wrt to show
    @JoinColumn
    @ManyToOne
    private Show show;


}

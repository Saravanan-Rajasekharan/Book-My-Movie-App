package com.example.BookMyShow.Model;

import com.example.BookMyShow.Enum.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="theaterSeats")
@Data
@NoArgsConstructor
public class TheaterSeats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seatNo;

    private SeatType seatType;

   //Mapping

    @ManyToOne
    @JoinColumn
    private Theater theater;
}

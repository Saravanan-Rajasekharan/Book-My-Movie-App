package com.example.BookMyShow.Model;

import com.example.BookMyShow.Enum.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="showSeat")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean isBooked;

    private int price; //price of seat for that show

    private String seatNo;

    private Date bookedAt;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;


}

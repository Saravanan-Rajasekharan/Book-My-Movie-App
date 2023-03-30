package com.example.BookMyShow.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="theaters")
@Data
@NoArgsConstructor
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String location;

    //Parent wrt to theaterSeats

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<TheaterSeats> theaterSeatsList= new ArrayList<>();

    //This is parent wrt show entity

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<Show> showList = new ArrayList<>();

}

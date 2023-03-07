package com.example.BookMyShow.Model;

import jakarta.persistence.*;

@Entity
@Table(name ="show")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String showDate;

    private String showTime;

    //private ShowType showType;

    //Mappings





    //Constructors





    //Getters and Setters

}

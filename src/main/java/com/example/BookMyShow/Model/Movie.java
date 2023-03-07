package com.example.BookMyShow.Model;

import com.example.BookMyShow.Enum.Genre;
import com.example.BookMyShow.Enum.Language;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {

    private String name;

    private Double rating;

    private int duration;

    private Language language;

    private Genre genre;

    //Mappings





    //Constructors





    //Getters and Setters


}

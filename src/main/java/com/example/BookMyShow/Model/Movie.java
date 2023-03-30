package com.example.BookMyShow.Model;

import com.example.BookMyShow.Enum.Genre;
import com.example.BookMyShow.Enum.Language;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="movies")
@Data
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String movieName;

    private Double rating;

    private int duration;

    @Enumerated(value=EnumType.STRING)
    private Language language;

    @Enumerated(value=EnumType.STRING)
    private Genre genre;



}

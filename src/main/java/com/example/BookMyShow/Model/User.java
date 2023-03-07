package com.example.BookMyShow.Model;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    private int age;

    private String mobNo;

    private String Address;

    //Mappings





    //Constructors





    //Getters and Setters


}

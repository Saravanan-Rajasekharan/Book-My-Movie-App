package com.example.BookMyShow.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    @Column(unique = true, nullable = false)  /* required variable */
    private String email;

    @NonNull                    /* required variable */
    @Column(unique = true)
    private String mobNo;

    private String address;

    //User is parent wrt to ticket
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Ticket> bookedTickets = new ArrayList<>();


}

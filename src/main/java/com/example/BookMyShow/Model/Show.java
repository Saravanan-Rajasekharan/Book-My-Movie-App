package com.example.BookMyShow.Model;

import com.example.BookMyShow.Enum.ShowType;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="shows")
@Data
@NoArgsConstructor
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private LocalDate showDate;

    private LocalTime showTime;

    @Enumerated(value=EnumType.STRING)
    private ShowType showType;


    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    // This is a child w.r.t movie
    @ManyToOne
    @JoinColumn
    private Movie movie;

    //The show is child wrt to Theater

    @ManyToOne
    @JoinColumn
    private Theater theater;

    // Show is parent wrt Ticket
    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<Ticket> ticketList = new ArrayList<>();

    //Show is parent wrt ShowSeat
    @OneToMany(mappedBy ="show", cascade = CascadeType.ALL)
    private List<ShowSeat> showSeatList = new ArrayList<>();



}

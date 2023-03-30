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
import java.util.Date;

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

    //Mappings

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;



}

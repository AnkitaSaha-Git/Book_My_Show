package com.example.book_my_show.Entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="ticket")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int totalAmount;

    private String movieName;

    private LocalDate showTime;

    private LocalDate showDate;

    private String ticketId= UUID.randomUUID().toString();

    private String theatreName;

    private String bookedSeats;

    //ticket is child wrt to userEntity
    @ManyToOne
    @JoinColumn
    private UserEntity userEntity;


    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;

}

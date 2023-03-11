package com.example.book_my_show.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="ticket")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
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

package com.example.book_my_show.Entities;

import com.example.book_my_show.Enums.SeatType;
import jakarta.persistence.*;

@Entity
@Table(name="theater_seats")
public class TheaterSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private String seatNo;

    @ManyToOne
    @JoinColumn
    private TheaterEntity theaterEntity;

}

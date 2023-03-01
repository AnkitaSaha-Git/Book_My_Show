package com.example.book_my_show.Entities;


import com.example.book_my_show.Enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="showseats")
@Data
@NoArgsConstructor
public class ShowSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean isBooked;

    private int price;//price of CLASSIC Seat for that particualar

    private String seatNo;

    @Enumerated(value=EnumType.STRING)
    private SeatType seatType;

    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;
}

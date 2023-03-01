package com.example.book_my_show.Entities;

import com.example.book_my_show.Enums.Genre;
import com.example.book_my_show.Enums.Language;
import com.example.book_my_show.Enums.ShowType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="movies")
@Data
@NoArgsConstructor
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    @NonNull
    private String movieName;

    private double ratings;

    private int duration;

    @Enumerated(value = EnumType.STRING)
    private Language language;

    @Enumerated(value= EnumType.STRING)
    private Genre genre;


    @OneToMany(mappedBy = "movieEntity",cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList= new ArrayList<>();
}

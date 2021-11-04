package com.hellofresh.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "review")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private long id;

    @Column(name = "rating")
    private int rating;

    @Column(name = "comment", length = 2000)
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="recipe_id", nullable=false)
    @JsonIgnoreProperties("reviews")
    private Recipe recipe;
}

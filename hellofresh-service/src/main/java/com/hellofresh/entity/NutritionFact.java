package com.hellofresh.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "nutrition_fact")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class NutritionFact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "energy")
    private String energy;

    @Column(name = "fat")
    private String fat;

    @Column(name = "saturated_fat")
    private String saturatedFat;

    @Column(name = "carbohydrate")
    private String carbohydrate;
    @Column(name = "sugar")
    private String sugar;

    @Column(name = "fiber")
    private String fiber;

    @Column(name = "protein")
    private String protein;

    @Column(name = "cholesterol")
    private String cholesterol;

    @Column(name = "sodium")
    private String sodium;

//    @OneToOne
//    @JoinColumn(name = "recipe_id", referencedColumnName = "id", nullable = false)
//    private Recipe recipe;
}

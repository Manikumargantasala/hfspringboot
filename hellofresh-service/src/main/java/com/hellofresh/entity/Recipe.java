package com.hellofresh.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "recipe")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(
            name = "recipe_ingredient",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private Collection<Ingredient> ingredients;

    @OneToMany(targetEntity=Instruction.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    private Collection<Instruction> instructions;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="nutrition_facts_id")
    private NutritionFact nutritionFact;

    //@OneToMany(targetEntity=Review.class, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "recipe")
    @OneToMany(mappedBy="recipe")
    @JsonIgnoreProperties("recipe")
    private Collection<Review> reviews;
}

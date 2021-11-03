package com.hellofresh.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "menu")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany
    @JoinTable(
            name = "menu_recipe",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id"))
    private Collection<Recipe> recipes;
    }

package com.hellofresh.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "instruction")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Instruction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private long id;

    @Column(name = "step", nullable = false)
    private int step;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

//    @ManyToOne
//    @JoinColumn(name = "recipe_id", nullable = false)
//    @JsonIgnore
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
//    @JsonIgnoreProperties("instructions")
//    private Recipe recipe;

}

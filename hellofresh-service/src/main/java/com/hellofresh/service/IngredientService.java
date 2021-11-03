package com.hellofresh.service;

import com.hellofresh.entity.Ingredient;

import java.util.List;

public interface IngredientService {
    void add(List<Ingredient> ingredients);

    List<Ingredient> get();

    Ingredient get(long id);

    void delete(long id);
}

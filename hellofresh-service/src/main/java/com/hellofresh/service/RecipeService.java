package com.hellofresh.service;

import com.hellofresh.entity.Recipe;

import java.util.List;

public interface RecipeService {
    void add(List<Recipe> recipes);

    List<Recipe> get();

    Recipe get(long id);

    void delete(long id);
}

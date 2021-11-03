package com.hellofresh.service;

import com.hellofresh.entity.NutritionFact;

import java.util.List;

public interface NutritionFactService {
    void add(List<NutritionFact> nutritionFacts);

    List<NutritionFact> get();

    NutritionFact get(long id);

    void delete(long id);
}

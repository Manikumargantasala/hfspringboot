package com.hellofresh.service.impl;

import com.hellofresh.entity.NutritionFact;
import com.hellofresh.repository.NutritionFactRepository;
import com.hellofresh.service.NutritionFactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionFactServiceImpl implements NutritionFactService {

    @Autowired
    private NutritionFactRepository repository;

    @Override
    public void add(List<NutritionFact> nutritionFacts) {
        repository.saveAll(nutritionFacts);
    }

    @Override
    public List<NutritionFact> get() {
        return repository.findAll();
    }

    @Override
    public NutritionFact get(long id) {
        return repository.getById(id);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}

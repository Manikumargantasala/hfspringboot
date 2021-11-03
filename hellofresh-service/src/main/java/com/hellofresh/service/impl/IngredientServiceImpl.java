package com.hellofresh.service.impl;

import com.hellofresh.repository.IngredientRepository;
import com.hellofresh.entity.Ingredient;
import com.hellofresh.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    IngredientRepository repository;

    @Override
    public void add(List<Ingredient> ingredients) {
        repository.saveAll(ingredients);
    }

    @Override
    public List<Ingredient> get() {
        return repository.findAll();
    }

    @Override
    public Ingredient get(long id) {
        return repository.getById(id);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}

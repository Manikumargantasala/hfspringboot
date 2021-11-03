package com.hellofresh.service.impl;

import com.hellofresh.entity.Recipe;
import com.hellofresh.repository.RecipeRepository;
import com.hellofresh.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository repository;

    @Override
    public void add(List<Recipe> recipes) {
        repository.saveAll(recipes);
    }

    @Override
    public List<Recipe> get() {
        return repository.findAll();
    }

    @Override
    public Recipe get(long id) {
        return repository.getById(id);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}

package com.hellofresh.controller;

import com.hellofresh.entity.Recipe;
import com.hellofresh.model.ResponseMessage;
import com.hellofresh.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipesService;

    @PutMapping(produces = "application/json")
    public ResponseMessage add(@RequestBody List<Recipe> Recipes) {
        recipesService.add(Recipes);
        return new ResponseMessage("Recipes added");
    }
    @GetMapping(value = "/{id}")
    public Recipe get(@PathVariable("id") long id) {
        return recipesService.get(id);
    }

    @GetMapping
    public List<Recipe> getAll() {
        return recipesService.get();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseMessage deleteById(@PathVariable("id") long id) {
        recipesService.delete(id);
        return new ResponseMessage("Recipe deleted");
    }

}

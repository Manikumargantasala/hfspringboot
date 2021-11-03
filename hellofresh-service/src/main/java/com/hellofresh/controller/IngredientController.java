package com.hellofresh.controller;

import com.hellofresh.entity.Ingredient;
import com.hellofresh.model.ResponseMessage;
import com.hellofresh.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    @Autowired
    private IngredientService ingredientsService;

    @PutMapping(produces = "application/json")
    public ResponseMessage add(@RequestBody List<Ingredient> ingredients) {
        ingredientsService.add(ingredients);
        return new ResponseMessage("ingredients added");
    }
    @GetMapping(value = "/{id}")
    public Ingredient get(@PathVariable("id") long id) {
        return ingredientsService.get(id);
    }

    @GetMapping
    public List<Ingredient> getAll() {
        return ingredientsService.get();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseMessage deleteById(@PathVariable("id") long id) {
        ingredientsService.delete(id);
        return new ResponseMessage("ingredient deleted");
    }

}

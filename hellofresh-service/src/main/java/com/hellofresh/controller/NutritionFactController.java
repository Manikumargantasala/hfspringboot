package com.hellofresh.controller;

import com.hellofresh.entity.NutritionFact;
import com.hellofresh.model.ResponseMessage;
import com.hellofresh.service.NutritionFactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nutritionFacts")
public class NutritionFactController {

    @Autowired
    private NutritionFactService nutritionFactsService;

    @PutMapping(produces = "application/json")
    public ResponseMessage add(@RequestBody List<NutritionFact> nutritionFacts) {
        nutritionFactsService.add(nutritionFacts);
        return new ResponseMessage("NutritionFacts added");
    }
    @GetMapping(value = "/{id}")
    public NutritionFact get(@PathVariable("id") long id) {
        return nutritionFactsService.get(id);
    }

    @GetMapping
    public List<NutritionFact> getAll() {
        return nutritionFactsService.get();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseMessage deleteById(@PathVariable("id") long id) {
        nutritionFactsService.delete(id);
        return new ResponseMessage("NutritionFact deleted");
    }

}

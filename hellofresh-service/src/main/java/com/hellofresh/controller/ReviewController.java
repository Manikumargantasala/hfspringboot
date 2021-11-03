package com.hellofresh.controller;

import com.hellofresh.entity.Review;
import com.hellofresh.model.ResponseMessage;
import com.hellofresh.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService ReviewsService;

    @PutMapping(produces = "application/json")
    public ResponseMessage add(@RequestBody List<Review> reviews) {
        ReviewsService.add(reviews);
        return new ResponseMessage("Reviews added");
    }
    @GetMapping(value = "/{id}")
    public Review get(@PathVariable("id") long id) {
        return ReviewsService.get(id);
    }

    @GetMapping
    public List<Review> getAll() {
        return ReviewsService.get();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseMessage deleteById(@PathVariable("id") long id) {
        ReviewsService.delete(id);
        return new ResponseMessage("Review deleted");
    }

}

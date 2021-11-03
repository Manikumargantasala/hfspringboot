package com.hellofresh.service;

import com.hellofresh.entity.Review;

import java.util.List;

public interface ReviewService {
    void add(List<Review> ingredients);

    List<Review> get();

    Review get(long id);

    void delete(long id);
}

package com.hellofresh.service.impl;

import com.hellofresh.entity.Review;
import com.hellofresh.repository.ReviewRepository;
import com.hellofresh.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository repository;

    @Override
    public void add(List<Review> reviews) {
        repository.saveAll(reviews);
    }

    @Override
    public List<Review> get() {
        return repository.findAll();
    }

    @Override
    public Review get(long id) {
        return repository.getById(id);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}

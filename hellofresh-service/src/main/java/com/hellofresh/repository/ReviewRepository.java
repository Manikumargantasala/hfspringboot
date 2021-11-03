package com.hellofresh.repository;

import com.hellofresh.entity.Recipe;
import com.hellofresh.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}

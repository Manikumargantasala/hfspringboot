package com.hellofresh.repository;

import com.hellofresh.entity.NutritionFact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutritionFactRepository extends JpaRepository<NutritionFact, Long> {

}

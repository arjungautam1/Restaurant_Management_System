package com.f1soft.restaurant_management_system.repository;

import com.f1soft.restaurant_management_system.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {



}

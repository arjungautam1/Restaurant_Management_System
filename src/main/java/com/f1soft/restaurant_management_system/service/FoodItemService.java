package com.f1soft.restaurant_management_system.service;

import com.f1soft.restaurant_management_system.model.FoodItem;

import java.util.List;

public interface FoodItemService {

    FoodItem saveFoodItem(FoodItem foodItem);

    List<FoodItem> getAllFood();
}

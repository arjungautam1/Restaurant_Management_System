/**
 * @author Arjun Gautam
 * Project :restaurant_management_system
 * Date : 2021-05-19
 */
package com.f1soft.restaurant_management_system.controller;

import com.f1soft.restaurant_management_system.model.FoodItem;
import com.f1soft.restaurant_management_system.service.FoodItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foodItem")
public class FoodItemController {
    private FoodItemService foodItemService;

    public FoodItemController(FoodItemService foodItemService) {
        this.foodItemService = foodItemService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FoodItem saveItem(@RequestBody FoodItem foodItem) {
        return foodItemService.saveFoodItem(foodItem);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FoodItem> findAllItems() {
        return foodItemService.getAllFood();
    }


}

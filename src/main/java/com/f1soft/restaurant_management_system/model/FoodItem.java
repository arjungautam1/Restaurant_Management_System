/**
 * @author Arjun Gautam
 * Project :restaurant_management_system
 * Date : 2021-05-19
 */
package com.f1soft.restaurant_management_system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
{
    "foodName":"MOMO",
    "price":"100",
    "description":"Chicken Steam"
}
*/

@Entity
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String foodName;
    private double price;
    private String description;

    public FoodItem(Long id, String foodName, double price, String description) {
        this.id = id;
        this.foodName = foodName;
        this.price = price;
        this.description = description;
    }

    public FoodItem() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

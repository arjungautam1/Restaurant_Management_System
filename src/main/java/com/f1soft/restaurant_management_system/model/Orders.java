/**
 * @author Arjun Gautam
 * Project :restaurant_management_system
 * Date : 2021-05-19
 */
package com.f1soft.restaurant_management_system.model;

import javax.persistence.*;
import java.util.List;

/*
        {
        "payment":{
        "paymentType":0
        },
        "foodItemList":[
        {"id":2}
        ],
        "user":{"id":1}
        }
*/

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Payment payment;

    @ManyToMany
    private List<FoodItem> foodItemList;

    @ManyToOne
    private User user;

    public Orders(Long id, Payment payment, List<FoodItem> foodItemList, User user) {
        this.id = id;
        this.payment = payment;
        this.foodItemList = foodItemList;
        this.user = user;
    }

    public Orders() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public void setFoodItemList(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

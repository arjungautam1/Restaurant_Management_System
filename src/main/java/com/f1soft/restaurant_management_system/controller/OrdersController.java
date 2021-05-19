/**
 * @author Arjun Gautam
 * Project :restaurant_management_system
 * Date : 2021-05-19
 */
package com.f1soft.restaurant_management_system.controller;

import com.f1soft.restaurant_management_system.model.Orders;
import com.f1soft.restaurant_management_system.model.User;
import com.f1soft.restaurant_management_system.service.OrderService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    private OrderService ordersService;

    public OrdersController(OrderService ordersService) {
        this.ordersService = ordersService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Orders saveOrders(@RequestBody Orders orders) {
        return ordersService.saveOrders(orders);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Orders> findAll() {
        return ordersService.findAllOrders();
    }

    @GetMapping("/user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Orders> getAllOrderByUser(@PathVariable Long id){
        return ordersService.findAllOrdersByUser(id);
    }

    @GetMapping("/totalAmount/{id}")
    @ResponseStatus(HttpStatus.OK)
    public double getTotalAmount(@PathVariable("id") Long orderId){
        return ordersService.getTotalAmount(orderId);
    }


}

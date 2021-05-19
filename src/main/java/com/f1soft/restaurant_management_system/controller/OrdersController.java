/**
 * @author Arjun Gautam
 * Project :restaurant_management_system
 * Date : 2021-05-19
 */
package com.f1soft.restaurant_management_system.controller;

import com.f1soft.restaurant_management_system.model.Orders;
import com.f1soft.restaurant_management_system.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;




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
}

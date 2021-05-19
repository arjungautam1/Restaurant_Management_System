/**
 * @author Arjun Gautam
 * Project :restaurant_management_system
 * Date : 2021-05-19
 */
package com.f1soft.restaurant_management_system.service;

import com.f1soft.restaurant_management_system.model.Orders;
import com.f1soft.restaurant_management_system.model.User;

import java.util.List;

public interface OrderService {
    Orders saveOrders(Orders orders);

    List<Orders> findAllOrders();

    List<Orders> findAllOrdersByUser(Long id);

}

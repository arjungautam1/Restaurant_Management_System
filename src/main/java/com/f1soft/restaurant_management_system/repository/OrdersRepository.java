package com.f1soft.restaurant_management_system.repository;

import com.f1soft.restaurant_management_system.model.Orders;
import com.f1soft.restaurant_management_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

    List<Orders> findOrdersByUserId(Long id);


}

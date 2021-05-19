package com.f1soft.restaurant_management_system.repository;

import com.f1soft.restaurant_management_system.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository  extends JpaRepository<Orders,Long> {

}

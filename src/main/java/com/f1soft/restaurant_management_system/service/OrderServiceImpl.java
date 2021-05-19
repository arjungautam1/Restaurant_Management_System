package com.f1soft.restaurant_management_system.service;

import com.f1soft.restaurant_management_system.model.Orders;
import com.f1soft.restaurant_management_system.model.Payment;
import com.f1soft.restaurant_management_system.model.User;
import com.f1soft.restaurant_management_system.repository.OrdersRepository;
import com.f1soft.restaurant_management_system.repository.PaymentRepository;
import com.f1soft.restaurant_management_system.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrdersRepository ordersRepository;
    private final PaymentRepository paymentRepository;
    private final UserRepository userRepository;


    public OrderServiceImpl(OrdersRepository ordersRepository, PaymentRepository paymentRepository, UserRepository userRepository) {
        this.ordersRepository = ordersRepository;
        this.paymentRepository = paymentRepository;
        this.userRepository = userRepository;
    }


    @Override
    public Orders saveOrders(Orders orders) {
        User user = userRepository.findById(orders.getUser().getId()).orElseThrow(() -> new IllegalStateException("User not found!"));
        List<Orders> ordersList = user.getOrdersList();
        Orders orders1 = new Orders();
        Payment payment = new Payment();
        payment.setPaymentType(orders.getPayment().getPaymentType());
        paymentRepository.save(payment);
        orders1.setPayment(payment);
        orders1.setFoodItemList(orders.getFoodItemList());
        orders1.setUser(orders.getUser());
        ordersRepository.save(orders1);
        ordersList.add(orders1);
        user.setOrdersList(ordersList);
        userRepository.save(user);
        return orders1;
    }

    @Override
    public List<Orders> findAllOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public List<Orders> findAllOrdersByUser(Long id) {
        return ordersRepository.findOrdersByUserId(id);
    }




}

/**
 * @author Arjun Gautam
 * Project :restaurant_management_system
 * Date : 2021-05-19
 */
package com.f1soft.restaurant_management_system.service;

import com.f1soft.restaurant_management_system.model.Payment;
import com.f1soft.restaurant_management_system.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);

    }
}

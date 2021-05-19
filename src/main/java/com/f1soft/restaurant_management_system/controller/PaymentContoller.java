/**
 * @author Arjun Gautam
 * Project :restaurant_management_system
 * Date : 2021-05-19
 */
package com.f1soft.restaurant_management_system.controller;

import com.f1soft.restaurant_management_system.model.Payment;
import com.f1soft.restaurant_management_system.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentContoller {
    private PaymentService paymentService;

    public PaymentContoller(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Payment savePayment(@RequestBody Payment payment) {
        return paymentService.savePayment(payment);
    }
}

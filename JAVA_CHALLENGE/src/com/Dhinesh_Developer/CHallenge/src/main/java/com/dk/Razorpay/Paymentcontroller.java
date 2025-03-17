package com.dk.Razorpay;

import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class Paymentcontroller {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create-order")
    public String createOrder(@RequestParam int amount,@RequestParam String currency,@RequestParam String  receiptId) throws RazorpayException {
        return paymentService.createOrder(amount,currency,receiptId);

    }
}

package com.dk.Razorpay;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Value("${razorpay_api_key}")
    private String apiKey;

    @Value("${razorpay_api_secret}")
    private String apiSecret;

    public String createOrder(int amount,String currency,String receiptId) throws RazorpayException {
        RazorpayClient razorpayClient = new RazorpayClient(apiKey,apiSecret);
        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount",amount * 100);
        orderRequest.put("currency",currency);
        orderRequest.put("receiptId",receiptId);
        Order order = razorpayClient.orders.create(orderRequest);
        return order.toString();
    }

}

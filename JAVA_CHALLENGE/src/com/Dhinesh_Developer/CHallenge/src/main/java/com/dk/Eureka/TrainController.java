package com.dk.Eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/train")
public class TrainController {

    @GetMapping("/status")
    public String getTrainStatus(){
        return "Train Ticket Booking Service is Running";
    }

}

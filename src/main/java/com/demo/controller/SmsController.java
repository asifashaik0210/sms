package com.demo.controller;
import com.demo.payload.SmsRequest;
import com.demo.service.TwilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SmsController {

    @Autowired
    private TwilioService twilioService;

    @PostMapping("/send-sms")
    public String sendSms(@RequestBody SmsRequest smsRequest) {
        twilioService.sendSms(smsRequest.getTo(), smsRequest.getMessage());
        return "SMS sent successfully";
    }
}


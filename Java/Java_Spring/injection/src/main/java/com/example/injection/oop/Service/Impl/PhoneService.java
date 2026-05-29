package com.example.injection.oop.Service.Impl;

import com.example.injection.oop.Service.MessageService;

public class PhoneService implements MessageService {
    @Override
    public void send() {
        System.out.println("gửi bằng phone");
    }

    @Override
    public void milaai() {
        System.out.println("tao là phone");
    }
}

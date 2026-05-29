package com.example.injection.oop.Service.Impl;

import com.example.injection.oop.Service.MessageService;

public class EmailService implements MessageService {
    @Override
    public void send() {
        System.out.println("gửi bằng email");
    }

    @Override
    public void milaai() {
        System.out.println("tao là email");
    }
}

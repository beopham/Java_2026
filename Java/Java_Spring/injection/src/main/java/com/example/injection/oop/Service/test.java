package com.example.injection.oop.Service;

import com.example.injection.oop.Service.Impl.EmailService;
import com.example.injection.oop.Service.Impl.PhoneService;
import com.example.injection.oop.Service.Impl.UserService;

public class test {
    public static void main(String[] args) {
        MessageService emailService=new EmailService();
        UserService userService1=new UserService(emailService);
        userService1.kiemtramethod();
        userService1.mitenj();

        MessageService phone =new PhoneService();
        UserService userService2=new UserService(phone);
        userService2.mitenj();
        userService2.kiemtramethod();
    }
}

package com.example.injection.oop.Service.Impl;

import com.example.injection.oop.Service.MessageService;

public class UserService {
    private MessageService messageService;

    public UserService(MessageService messageService) {
        this.messageService = messageService;
    }
    public void kiemtramethod()
    {
        messageService.send();
    }
    public void mitenj()
    {
        messageService.milaai();
    }
}

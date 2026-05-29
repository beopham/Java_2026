package com.example.injection.service;

import org.springframework.stereotype.Component;

@Component("Xedap")
public class XeDap implements Phuongtien {

    @Override
    public String loaixe() {
        return  "Xe đạp";
    }
}

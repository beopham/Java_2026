package com.example.injection.service;

import org.springframework.stereotype.Component;

@Component("Xemay")
public class XeMay implements Phuongtien {

    @Override
    public String loaixe() {
        return "Xe máy";
    }
}

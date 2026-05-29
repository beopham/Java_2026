package com.example.ontapconstruction_injection.service;

import org.springframework.stereotype.Component;

@Component("xedap")
public class Xedap implements PhuongTien {

    @Override
    public String loaixe() {
        return "xe đạp ";
    }

    @Override
    public String tocdo() {
        return "chậm";
    }
}

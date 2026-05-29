package com.example.ontapconstruction_injection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("xemay")
@Primary
public class Xemay implements PhuongTien{

    @Override
    public String loaixe() {
        return "xe máy";
    }

    @Override
    public String tocdo() {
        return "nhanh";
    }
}

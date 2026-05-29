package com.example.ontapconstruction_injection.rest;

import com.example.ontapconstruction_injection.service.PhuongTien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Menu {
    private PhuongTien phuongTien;

    @Autowired
    public Menu(@Qualifier("xedap") PhuongTien phuongTien) {
        this.phuongTien = phuongTien;
    }
    @GetMapping("/plll")
    public String ok()
    {
        return phuongTien.loaixe();
    }
}

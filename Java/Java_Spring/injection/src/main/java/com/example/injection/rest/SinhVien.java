package com.example.injection.rest;

import com.example.injection.service.Phuongtien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class SinhVien {
    private Phuongtien phuongtien;

    @Autowired
    public SinhVien(@Qualifier("Xedap") Phuongtien phuongtien)   {
        this.phuongtien = phuongtien;
    }
    @GetMapping("/KAKAKA")
    public String loiaxe()
    {
        return phuongtien.loaixe();
    }
}

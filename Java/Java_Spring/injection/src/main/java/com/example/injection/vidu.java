package com.example.injection;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class vidu {


    @GetMapping("/nam")
    public String nam()
    {
        return "lalala âcscc";
    }
}

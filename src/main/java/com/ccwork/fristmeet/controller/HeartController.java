package com.ccwork.fristmeet.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/heart")
public class HeartController {
    //我在这边加一个备注先
    @PostMapping("/heart")
    private void heart(){

    }
}

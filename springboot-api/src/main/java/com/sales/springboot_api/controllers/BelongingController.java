package com.sales.springboot_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sales.springboot_api.dto.BelongingDTO;
import com.sales.springboot_api.services.BelongingService;

@RestController
@RequestMapping(value = "/belongings")
public class BelongingController {
    @Autowired
    private BelongingService belongingService;
    @PostMapping
    public void insert(@RequestBody BelongingDTO belongingDTO) {
        belongingService.insert(belongingDTO);
    }
}

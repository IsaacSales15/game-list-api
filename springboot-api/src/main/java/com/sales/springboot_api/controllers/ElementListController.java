package com.sales.springboot_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.sales.springboot_api.services.ElementListService;
import com.sales.springboot_api.dto.ElementListDTO;

@RestController
@RequestMapping(value = "/lists")
public class ElementListController {

    @Autowired
    private ElementListService elementListService;

    @GetMapping
    public List<ElementListDTO> findAll() {
        List<ElementListDTO> result = elementListService.findAll();
        return result;
    }
}

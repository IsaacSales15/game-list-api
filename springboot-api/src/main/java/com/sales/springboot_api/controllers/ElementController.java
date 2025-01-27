package com.sales.springboot_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import com.sales.springboot_api.entities.Element;
import com.sales.springboot_api.services.ElementService;
import com.sales.springboot_api.dto.ElementDTO;
import com.sales.springboot_api.dto.ElementMinDTO;

@RestController
@RequestMapping(value = "/list")
public class ElementController {

    @Autowired
    private ElementService elementService;

    @GetMapping
    public List<ElementMinDTO> findAll() {
        List<ElementMinDTO> result = elementService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public ElementDTO findById(@PathVariable Long id) {
        ElementDTO result = elementService.findById(id);
        return result;
    }

}

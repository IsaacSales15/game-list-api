package com.sales.springboot_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.springboot_api.dto.ElementMinDTO;
import com.sales.springboot_api.entities.Element;
import com.sales.springboot_api.repositories.ElementRepository;

@Service
public class ElementService {

    @Autowired
    private ElementRepository elementRepository;

    public List<ElementMinDTO> findAll() {
        List<Element> result = elementRepository.findAll();
        List<ElementMinDTO> dto = result.stream().map(x -> new ElementMinDTO(x)).toList();
        return dto;
    }

}
package com.sales.springboot_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.springboot_api.dto.ElementDTO;
import com.sales.springboot_api.dto.ElementMinDTO;
import com.sales.springboot_api.entities.Element;
import com.sales.springboot_api.repositories.ElementRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class ElementService {

    @Autowired
    private ElementRepository elementRepository;

    // Busca geral dos mini textos
    @Transactional(readOnly = true)
    public List<ElementMinDTO> findAll() {
        List<Element> result = elementRepository.findAll();
        List<ElementMinDTO> dto = result.stream().map(x -> new ElementMinDTO(x)).toList();
        return dto;
    }

    // Busca única por id
    @Transactional(readOnly = true)
    public ElementDTO findById(Long id) {
        Element result = elementRepository.findById(id).get();
        ElementDTO dto = new ElementDTO(result);
        return dto;
    }
}
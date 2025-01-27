package com.sales.springboot_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.springboot_api.entities.ElementList;
import com.sales.springboot_api.dto.ElementListDTO;
import com.sales.springboot_api.repositories.ElementListRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class ElementListService {

    @Autowired
    private ElementListRepository elementListRepository;

    // Busca geral dos mini textos
    @Transactional(readOnly = true)
    public List<ElementListDTO> findAll() {
        List<ElementList> result = elementListRepository.findAll();
        List<ElementListDTO> dto = result.stream().map(x -> new ElementListDTO(x)).toList();
        return dto;
    }
}
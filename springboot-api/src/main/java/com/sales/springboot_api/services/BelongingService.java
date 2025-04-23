package com.sales.springboot_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.springboot_api.entities.Belonging;
import com.sales.springboot_api.entities.Element;
import com.sales.springboot_api.entities.ElementList;
import com.sales.springboot_api.repositories.BelongingRepository;
import com.sales.springboot_api.repositories.ElementRepository;
import com.sales.springboot_api.repositories.ElementListRepository;
import com.sales.springboot_api.dto.BelongingDTO;

import jakarta.transaction.Transactional;

@Service
public class BelongingService {
    @Autowired
    private BelongingRepository belongingRepository;
    @Autowired
    private ElementRepository elementRepository;
    @Autowired
    private ElementListRepository elementListRepository;

    @Transactional
    public Belonging insert(BelongingDTO belongingDTO) {
        Element element = elementRepository.findById(belongingDTO.getElementId()).orElseThrow();
        ElementList list = elementListRepository.findById(belongingDTO.getListId()).orElseThrow();

        Belonging belonging = new Belonging(element, list, belongingDTO.getPosition());
        return belongingRepository.save(belonging);
    }

}

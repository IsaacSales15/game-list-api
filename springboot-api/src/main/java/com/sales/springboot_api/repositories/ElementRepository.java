package com.sales.springboot_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.springboot_api.entities.Element;

public interface ElementRepository extends JpaRepository<Element, Long> {
    
}

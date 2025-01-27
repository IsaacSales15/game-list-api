package com.sales.springboot_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.springboot_api.entities.ElementList;

public interface ElementListRepository extends JpaRepository<ElementList, Long> {

}

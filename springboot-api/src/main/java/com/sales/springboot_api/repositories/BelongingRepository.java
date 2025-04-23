package com.sales.springboot_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sales.springboot_api.entities.Belonging;
import com.sales.springboot_api.entities.BelongingPK;

public interface BelongingRepository extends JpaRepository<Belonging, BelongingPK> {

}

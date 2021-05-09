package com.luizmendes.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizmendes.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}

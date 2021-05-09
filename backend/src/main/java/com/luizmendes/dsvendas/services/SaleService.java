package com.luizmendes.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luizmendes.dsvendas.dto.SaleDTO;
import com.luizmendes.dsvendas.entities.Sale;
import com.luizmendes.dsvendas.repositories.SaleRepository;
import com.luizmendes.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public List<SaleDTO> findAll() {
		List<Sale> result = repository.findAll();
		
		return result.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true) //garante que toda a conexao com BD seja resolvida no service e o read only informa que nao precisa bloquear a tabela pois é so um select
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();//solucao do problema de varios selects (somente porque temos poucos vendedores
		Page<Sale> result = repository.findAll(pageable);
		
		return result.map(x -> new SaleDTO(x));
	}

}

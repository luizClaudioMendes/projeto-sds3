package com.luizmendes.dsvendas.dto;

import java.io.Serializable;

import com.luizmendes.dsvendas.entities.Seller;

public class SellerDTO implements Serializable{

	private static final long serialVersionUID = 5717099817218715058L;

	private Long id;
	private String name;
	
	public SellerDTO() {
	}

	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SellerDTO(Seller seller) {
		id = seller.getId();
		name = seller.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

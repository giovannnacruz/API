package com.senai.Giovanna.Cristina.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_Cliente")
public class Cliente {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "nCliente")
	private String nCliente;
	
	@Column(name = "telefone")
	private String telefone;
	
	
	public Long getidcCliente() {
		return idcCliente;
	}

	public void setidcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}

	public String getnCliente() {
		return nCliente;
	}

	public void setName(String nCliente) {
		this.nCliente = nCliente;
	}

	public String gettelefone() {
		return telefone;
	}

	public void setPrice(String telefone) {
		this.telefone = telefone;
	}

	
}



package com.senai.Giovanna.Cristina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Giovanna.Cristina.entities.Cliente;


public interface Repository extends JpaRepository<Cliente, Long> {

}

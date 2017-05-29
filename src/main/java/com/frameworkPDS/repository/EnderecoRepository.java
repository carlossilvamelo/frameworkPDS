package com.frameworkPDS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frameworkPDS.models.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String>{
	
	
}
package com.frameworkPDS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frameworkPDS.models.MarcaModelo;

@Repository
public interface MarcaModeloRepository extends JpaRepository<MarcaModelo, Long>{

}

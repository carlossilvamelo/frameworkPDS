package com.frameworkPDS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frameworkPDS.models.PrestadoraF;


@Repository
public interface PrestadoraRepository extends JpaRepository<PrestadoraF, String>{

}

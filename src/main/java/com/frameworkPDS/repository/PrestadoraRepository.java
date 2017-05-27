package com.frameworkPDS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frameworkPDS.models.Prestadora;


@Repository
public interface PrestadoraRepository extends JpaRepository<Prestadora, String>{

}

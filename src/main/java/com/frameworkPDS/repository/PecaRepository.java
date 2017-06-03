package com.frameworkPDS.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.frameworkPDS.models.PecaF;


@Repository
public interface PecaRepository extends JpaRepository<PecaF, Long>{

}

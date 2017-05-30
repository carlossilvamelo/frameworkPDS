package com.frameworkPDS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frameworkPDS.models.status.StatusServico;

@Repository
public interface StatusServicoRepository  extends JpaRepository<StatusServico, Integer>{

}

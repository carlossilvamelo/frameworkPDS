package com.frameworkPDS.services;


import java.util.List;

import javax.persistence.EnumType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.frameworkPDS.models.Contratante;
import com.frameworkPDS.repository.ContratanteRepository;

@Service
public abstract class ContratanteService implements IContratanteService{


	
	@Autowired
	private ContratanteRepository contratanteRepository;
	
	//@Autowired
	//private LogicaAcompanhamento logicaAcompanhamento;
	
	@Override
	public abstract void verificaProduto(String idContratante);
	
	@Override
	public Contratante buscarPorId(String id) {
		Contratante contratante = null;
		try {
			contratante = contratanteRepository.findOne(id);
		} catch (DataAccessException e) {
			System.err.println("Erro na camada de dados!");	
			e.printStackTrace();
		}
		return contratante;	
	}
	
	@Override
	public void inserir(Contratante contratante) {
		try {
			contratanteRepository.save(contratante);
		} catch (DataAccessException e) {
			System.err.println("Erro na camada de dados!");	
			e.printStackTrace();
		}
	}
	@Override
	public void deletar(Contratante contratante) {
		try {
			contratanteRepository.delete(contratante);
		} catch (DataAccessException e) {
			System.err.println("Erro na camada de dados!");	
			e.printStackTrace();
		}
	}


	@Override
	public List<Contratante> buscarTodos() {
		List<Contratante> contratantes = null;
		try {
			contratantes = contratanteRepository.findAll();
		} catch (DataAccessException e) {
			System.err.println("Erro na camada de dados!");	
			e.printStackTrace();
		}
		return contratantes;
	}

}

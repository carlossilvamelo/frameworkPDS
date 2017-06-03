package com.frameworkPDS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworkPDS.models.PrestadoraF;
import com.frameworkPDS.repository.PrestadoraRepository;


@Service
public class PrestadoraService implements IPrestadoraService{
	
	@Autowired
	private PrestadoraRepository prestadoraRepository;
	//@Autowired
	//private LogicaAcompanhamento logicaAcompanhamento;
	
	@Override
	public void inserir(PrestadoraF prestadora) {
		prestadoraRepository.save(prestadora);
	}

	@Override
	public void deletar(PrestadoraF prestadora) {
		prestadoraRepository.delete(prestadora);
	}

	@Override
	public PrestadoraF buscarPorId(String id) {
		return prestadoraRepository.findOne(id);
	}

	@Override
	public List<PrestadoraF> buscarTodos() {
		return prestadoraRepository.findAll();
	}

}

package com.frameworkPDS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworkPDS.models.Peca;
import com.frameworkPDS.repository.PecaRepository;


@Service
public class PecaService implements IPecaService{

	@Autowired
	private PecaRepository pecaRepository;
	
	@Override
	public void inserir(Peca peca) {
		pecaRepository.save(peca);
	}

	@Override
	public void deletar(Peca peca) {
		pecaRepository.delete(peca);
	}

	@Override
	public List<Peca> buscarTodos() {
		return pecaRepository.findAll();
	}

	@Override
	public Peca buscarPorId(Long id) {
		return pecaRepository.getOne(id);
	}

	

}

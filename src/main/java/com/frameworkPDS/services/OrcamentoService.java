package com.frameworkPDS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworkPDS.models.OrcamentoF;
import com.frameworkPDS.repository.OrcamentoRepository;



@Service
public class OrcamentoService implements IOrcamentoService{

	@Autowired
	private OrcamentoRepository orcamentoRepository;
	
	private ContadorServico cs;
	
	
	// acesso banco de dados
	@Override
	public void inserir(OrcamentoF orcamento) {
		orcamentoRepository.save(orcamento);
	}

	@Override
	public void deletar(OrcamentoF orcamento) {
		orcamentoRepository.delete(orcamento);
	}

	@Override
	public OrcamentoF buscarPorId(Long id) {
		return orcamentoRepository.getOne(id);
	}

	@Override
	public List<OrcamentoF> buscarTodos() {
		return orcamentoRepository.findAll();
	}

}

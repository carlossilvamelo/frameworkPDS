package com.frameworkPDS.services;

import java.util.List;
import com.frameworkPDS.models.OrcamentoF;


public interface IOrcamentoService {

	//acesso ao banco
	public void inserir(OrcamentoF orcamento);
	public void deletar(OrcamentoF orcamento);
	public List<OrcamentoF> buscarTodos();
	public OrcamentoF buscarPorId(Long id);
}

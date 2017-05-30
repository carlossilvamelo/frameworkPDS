package com.frameworkPDS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworkPDS.models.Produto;
import com.frameworkPDS.models.Servico;
import com.frameworkPDS.repository.ProdutoRepository;



@Service
public class ProdutoService implements IProdutoService{

	@Autowired
	private ProdutoRepository produtoRepository;
	

	@Override
	public void inserir(Produto produto) {
		produtoRepository.save(produto);
	}

	@Override
	public Produto buscarPorId(String id) {
		return produtoRepository.getOne(id);
	}
	@Override
	public void deletarTodos(Produto produto) {
		
		/*for(Servico serv: produto.getServicos()){
			servicoRepository.delete(serv);
		}*/
		
	}
	@Override
	public List<Produto> buscarTodos() {
		return produtoRepository.findAll();
	}
	
	@Override
	public void deletar(Produto produto) {
		produtoRepository.delete(produto);
	}
	
	@Override
	public void deletePorId(String idProduto) {
		
		produtoRepository.deletePorId(idProduto);
	}
	
	@Override
	public void deleteAlertasProduto(Produto produto) {
		//TODO criar esse método
		
		//dataFacade.getAlertaRepository().deleteByTipoAlerta(veiculo);
	}

	
	

}

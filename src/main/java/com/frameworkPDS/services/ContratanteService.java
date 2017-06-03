package com.frameworkPDS.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.frameworkPDS.models.ContratanteF;
import com.frameworkPDS.repository.ContratanteRepository;

@Service
public class ContratanteService implements IContratanteService{

	@Autowired
	private ContratanteRepository contratanteRepository;
	
	//@Autowired
	//private LogicaAcompanhamento logicaAcompanhamento;
	
	@Override
	public void verificaProduto(String idContratante) {
	}
	
	@Override
	public ContratanteF buscarPorId(String id) {
		ContratanteF contratante = null;
		try {
			contratante = contratanteRepository.findOne(id);
		} catch (DataAccessException e) {
			System.err.println("Erro na camada de dados!");	
			e.printStackTrace();
		}
		return contratante;	
	}
	
	@Override
	public void inserir(ContratanteF contratante) {
		try {
			contratanteRepository.save(contratante);
		} catch (DataAccessException e) {
			System.err.println("Erro na camada de dados!");	
			e.printStackTrace();
		}
	}
	@Override
	public void deletar(ContratanteF contratante) {
		try {
			contratanteRepository.delete(contratante);
		} catch (DataAccessException e) {
			System.err.println("Erro na camada de dados!");	
			e.printStackTrace();
		}
	}


	@Override
	public List<ContratanteF> buscarTodos() {
		List<ContratanteF> contratantes = null;
		try {
			contratantes = contratanteRepository.findAll();
		} catch (DataAccessException e) {
			System.err.println("Erro na camada de dados!");	
			e.printStackTrace();
		}
		return contratantes;
	}

	@Override
	public ContratanteF buscarID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}

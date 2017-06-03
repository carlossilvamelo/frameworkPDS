package com.frameworkPDS.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworkPDS.models.CheckInF;
import com.frameworkPDS.models.ContratanteF;
import com.frameworkPDS.models.PrestadoraF;
import com.frameworkPDS.models.ProdutoF;
import com.frameworkPDS.models.ServicoF;
import com.frameworkPDS.repository.CheckInRepository;
import com.frameworkPDS.repository.ServicoRepository;


@Service
public class ServicoService implements IServicoService{

	@Autowired
	private ServicoRepository servicoRepository;
	@Autowired
	private CheckInRepository checkInRepository;

	
	/**
	 * Requisito gera uma atualização do status do serviço
	 * 
	 * 
	 * @param idServico
	 */
	
	@Override
	public List<ServicoF> buscarServicosPorContratante(ContratanteF contratante) {
		return servicoRepository.listarServicoPorContratante(contratante);
	}
	
	@Override
	public List<ServicoF> buscarServicosPorPrestadora(PrestadoraF prestadora) {
		return servicoRepository.listarServicoPorPrestadora(prestadora);
	}

	@Override
	public void inserir(ServicoF servico) {
		servicoRepository.save(servico);
	}

	@Override
	public void deletar(ServicoF servico) {
		servicoRepository.delete(servico);
	}
	
	

	@Override
	public ServicoF buscarPorId(Integer id) {
		return servicoRepository.getOne(id);
	}

	@Override
	public List<ServicoF> buscarTodos() {
		return servicoRepository.findAll();
	}


	@Override
	public List<ServicoF> buscarServicosPorIdContratante(String idCliente) {
		return null;
	}
	
	@Override
	public void atualizarProduto(ProdutoF produto) {
		servicoRepository.updateProduto(produto);
	}

	@Override
	public List<CheckInF> listarCheckIn(Integer id) {
		// TODO Auto-generated method stub
		return checkInRepository.listarCheckInPorServico(id);
	}
	
	@Override
	public void verificarServico(Integer id){
		
		/*Servico servi = servicoRepository.findOne(id);
		
		for (CheckIn checkin : servi.getCheckIns()) {
			
			if(checkin.getClassficacao() == 0){
				servicoRepository.delete(servi);
			}
			
		}*/
	}

	@Override
	public void deletarTodos(ProdutoF produto) {
		// TODO Auto-generated method stub
		
	}
	

}
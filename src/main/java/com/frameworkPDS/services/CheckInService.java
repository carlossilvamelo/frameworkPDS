package com.frameworkPDS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.frameworkPDS.models.CheckInF;
import com.frameworkPDS.repository.CheckInRepository;



@Service
public class CheckInService implements ICheckInService{
	
	@Autowired
	private CheckInRepository checkInRepository;

	@Override
	public void inserir(CheckInF checkIn) {
		try {
			checkInRepository.save(checkIn);
		} catch (DataAccessException e) {
			System.err.println("Erro na camada de dados. [checkIn]");
			e.printStackTrace();
		}
		
	}

	@Override
	public List<CheckInF> buscarCheckInPorId(Integer idServico) {
		
		return checkInRepository.listarCheckInPorServico(idServico);
	}
	
}

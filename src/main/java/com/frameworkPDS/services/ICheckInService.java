package com.frameworkPDS.services;

import java.util.List;
import com.frameworkPDS.models.CheckInF;


public interface ICheckInService {

	public void inserir(CheckInF checkIn);

	List<CheckInF> buscarCheckInPorId(Integer idServico);

}

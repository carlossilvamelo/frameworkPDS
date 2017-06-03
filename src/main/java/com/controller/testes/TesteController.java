package com.controller.testes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.frameworkPDS.models.Acompanhamento;
import com.frameworkPDS.models.CheckIn;
import com.frameworkPDS.models.Contratante;
import com.frameworkPDS.models.Endereco;
import com.frameworkPDS.models.Servico;
import com.frameworkPDS.models.status.EmAndamento;
import com.frameworkPDS.models.status.Finalizado;
import com.frameworkPDS.models.status.Iniciado;
import com.frameworkPDS.models.status.State;
import com.frameworkPDS.repository.AcompanhamentoRepository;
import com.frameworkPDS.repository.ContratanteRepository;
import com.frameworkPDS.repository.ServicoRepository;



@Controller
public class TesteController {

	
	@Autowired
	private ServicoRepository sr;
	@Autowired
	private AcompanhamentoRepository ar;
	@Autowired
	private ContratanteRepository cr;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(){
		
		
        return null;
	}
}

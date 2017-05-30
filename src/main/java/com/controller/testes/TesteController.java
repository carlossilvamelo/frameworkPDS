package com.controller.testes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.frameworkPDS.models.status.Finalizado;
import com.frameworkPDS.models.status.Iniciado;
import com.frameworkPDS.models.status.StatusServico;
import com.frameworkPDS.repository.StatusServicoRepository;


@Controller
public class TesteController {

	@Autowired
	private StatusServicoRepository ssr;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(){
		System.out.println("entrou");
		
		/*Iniciado status = new Iniciado();
		status.setId(10);
		ssr.save(status);
		*/
		
		
		
        return null;
	}
}

package com.controller.testes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.frameworkPDS.services.ServicoService;





@Controller
public class TesteController {

	@Autowired
	private ServicoService ss;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(){

		ss.buscarPeca();
		
	
        return null;
	}
}

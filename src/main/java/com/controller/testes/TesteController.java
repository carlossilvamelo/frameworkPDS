package com.controller.testes;

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
import com.frameworkPDS.repository.AcompanhamentoRepository;
import com.frameworkPDS.repository.ContratanteRepository;
import com.frameworkPDS.repository.ServicoRepository;
import com.frameworkPDS.services.ContadorServico;
import com.frameworkPDS.services.ContratanteService;
import com.frameworkPDS.services.IServicoService;
import com.frameworkPDS.services.ProdutoService;
import com.frameworkPDS.services.ServicoService;




@Controller
public class TesteController {

	
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(){
	
        return null;
	}
}

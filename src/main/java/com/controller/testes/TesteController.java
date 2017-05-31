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
		
		/*
		Servico s = new Servico();
		s.setDescricao("teste");
		Contratante c = new Contratante();
		c.setNome("carlos");
		c.setId("90");
		
		//c.setEndereco();
		c.addServico(s);
		s.setContratante(c);
		Acompanhamento a = new Acompanhamento();
		a.setObservações("acompanhamento");
		a.setCheckIns(new ArrayList<CheckIn>());
		StatusServico status = new Iniciado();
		a.setStatus(status);
		s.setAcompanhamento(a);
		
		sr.save(s);
		*/
		
	
		
		/*
		Contratante con = new Contratante();
		con.setId("1");
		
		con.setEmail("chsm@melo");
		con.setNome("teste2");
		
		Endereco end = new Endereco();
		end.setBairro("tamarineira");
		end.setCep("52110000");
		con.setEndereco(end);
		
		Servico serv = new Servico();
		serv.setDescricao("servTest");
		serv.setContratante(con);
		con.addServico(serv);
		Acompanhamento ac = new Acompanhamento();
		State estados = new Iniciado();
		estados = estados.proximo();
		ac.setStatusServico(estados.getNome());
		ac.setObservações("obsTest");
		
		serv.setAcompanhamento(ac);
		
		cr.save(con);
		
		*/
		
		
		
		//Contratante con=cr.findOne("1");
		//System.out.println(con.getNome());
		//System.out.println(con.getServico().size());
		List<Servico> servico = sr.findAll();
		Servico serv = servico.get(0);
		//System.out.println(serv.getAcompanhamento().getStatusServico());
		
		State estado = State.getStatusAtual(serv.getAcompanhamento().getStatusServico());
		estado = estado.proximo();
		serv.getAcompanhamento().setStatusServico(estado.getNome());
		
		sr.save(serv);
        return null;
	}
}

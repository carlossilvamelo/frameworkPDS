package com.frameworkPDS.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class AcompanhamentoF implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="id_acompanhamento")
	private Integer id;
	private String statusServico;
	
	@OneToMany(mappedBy="acompanhamento",fetch=FetchType.LAZY, cascade={CascadeType.ALL})
	private List<CheckInF> checkIns;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.MERGE})
	@JoinColumn(name="id_servico")
	private ServicoF servico;
	private String observações;
	
	
	
	public ServicoF getServico() {
		return servico;
	}

	public void setServico(ServicoF servico) {
		this.servico = servico;
	}
	
	public List<CheckInF> getCheckIns() {
		return checkIns;
	}

	public void setCheckIns(List<CheckInF> checkIns) {
		this.checkIns = checkIns;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getStatusServico() {
		return statusServico;
	}

	public void setStatusServico(String statusServico) {
		this.statusServico = statusServico;
	}

	public String getObservações() {
		return observações;
	}

	public void setObservações(String observações) {
		this.observações = observações;
	}
	
	
}

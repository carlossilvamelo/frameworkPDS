package com.frameworkPDS.models;

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
import javax.persistence.OneToOne;

import com.frameworkPDS.models.status.State;

@Entity
public class Acompanhamento {

	@Id
	@GeneratedValue
	@Column(name="id_acompanhamento")
	private Integer id;
	private String statusServico;
	
	@OneToMany(mappedBy="servico",fetch=FetchType.LAZY, cascade={CascadeType.REMOVE, CascadeType.PERSIST})
	private List<CheckIn> checkIns;
	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.MERGE})
	@JoinColumn(name="id_servico")
	private Servico servico;
	private String observações;
	
	
	
	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}
	
	public List<CheckIn> getCheckIns() {
		return checkIns;
	}

	public void setCheckIns(List<CheckIn> checkIns) {
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

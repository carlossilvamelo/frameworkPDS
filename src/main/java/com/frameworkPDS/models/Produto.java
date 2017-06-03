package com.frameworkPDS.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Produto implements Serializable{

	

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_produto")
	private String id;
	private String nome;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_marcaModelo")
	private MarcaModelo marcaModelo;

	

	

	
	
}

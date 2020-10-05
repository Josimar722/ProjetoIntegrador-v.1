package com.sustentArt.SustentArt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //Entidade  de Relacionamento
@Table(name = "tb_tema")
public class Tema {
	
	@Id// Identificar o tem por ID
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull//Este campo não pode ser nulo
	@Size(min = 5, max = 200)
	private String conteudo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHora = new java.sql.Date(System.currentTimeMillis());

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	
	

}

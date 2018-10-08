package br.edu.iftm.esof.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atividade implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	private String nome;
	private Double percentualCargaHoraria;
	private Double maximoAtividadesSemestre;
	private Double percentualPorAtividade;
	
	
	public Atividade() {}


	public Atividade(Integer codigo, String nome, Double percentualCargaHoraria, Double maximoAtividadesSemestre,
			Double percentualPorAtividade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.percentualCargaHoraria = percentualCargaHoraria;
		this.maximoAtividadesSemestre = maximoAtividadesSemestre;
		this.percentualPorAtividade = percentualPorAtividade;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPercentualCargaHoraria() {
		return percentualCargaHoraria;
	}


	public void setPercentualCargaHoraria(Double percentualCargaHoraria) {
		this.percentualCargaHoraria = percentualCargaHoraria;
	}


	public Double getMaximoAtividadesSemestre() {
		return maximoAtividadesSemestre;
	}


	public void setMaximoAtividadesSemestre(Double maximoAtividadesSemestre) {
		this.maximoAtividadesSemestre = maximoAtividadesSemestre;
	}


	public Double getPercentualPorAtividade() {
		return percentualPorAtividade;
	}


	public void setPercentualPorAtividade(Double percentualPorAtividade) {
		this.percentualPorAtividade = percentualPorAtividade;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atividade other = (Atividade) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
}

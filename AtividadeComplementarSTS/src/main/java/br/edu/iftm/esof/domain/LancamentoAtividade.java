package br.edu.iftm.esof.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LancamentoAtividade  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	private Double quantidadedeHoras;
	private Date dataInicio;
	private Date dataFim;
	private Aluno aluno;
	private Atividade atividade;
	
	public LancamentoAtividade() {}

	public LancamentoAtividade(Integer codigo, Double quantidadedeHoras, Date dataInicio, Date dataFim, Aluno aluno,
			Atividade atividade) {
		super();
		this.codigo = codigo;
		this.quantidadedeHoras = quantidadedeHoras;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.aluno = aluno;
		this.atividade = atividade;
	}
	
	public String getSemestreAtividade() {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataFim);
		int ano = calendar.get(Calendar.YEAR);
		int mes = calendar.get(Calendar.MONTH);
		if(mes>5) {
			return ano+"-2";
		}else {
			
			return ano+"-1";
		}		
	}
	
	public Integer getHorasAproveitadas() {
		
		
		return null;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getQuantidadedeHoras() {
		return quantidadedeHoras;
	}

	public void setQuantidadedeHoras(Double quantidadedeHoras) {
		this.quantidadedeHoras = quantidadedeHoras;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
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
		LancamentoAtividade other = (LancamentoAtividade) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	

}

package entidades;

import javax.persistence.*;
import java.time.LocalDate;  

@Entity
public class Servico {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tipo;
	private LocalDate data_realizacao;
	private double valor;
	
	public Servico() {}
	
	public Servico(String tipo, LocalDate data_realizacao, double valor) {
		this.tipo = tipo;
		this.data_realizacao = data_realizacao;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getData_realizacao() {
		return data_realizacao;
	}

	public void setData_realizacao(LocalDate data_realizacao) {
		this.data_realizacao = data_realizacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}

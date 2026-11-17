package entidades;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
public class Funcionario extends Pessoa{
	private String cargo;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(String nome, int cpf, String telefone, String email, String cargo, double salario) {
		super(nome, cpf, telefone, email);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}

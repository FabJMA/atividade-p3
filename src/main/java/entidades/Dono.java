package entidades;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
public class Dono extends Pessoa{
	public Dono() {}
	
	public Dono(String nome, int cpf, String telefone, String email) {
		super(nome, cpf, telefone, email);
	}
}

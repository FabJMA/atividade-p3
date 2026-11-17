package main;

import javax.persistence.*;
import entidades.*;
import jpautil.*;

public class Main {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Dono dono = new Dono();
		dono.setNome("Matias");
		dono.setCpf(00000000000);
		dono.setEmail("mateusMatias@pets.com");
		dono.setTelefone("(81) 99999-9999");
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(dono);
		tx.commit();
		
		em.close();
		JPAUtil.fechar();
	}
}

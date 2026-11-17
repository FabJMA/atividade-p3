package main;

import javax.persistence.*;
import entidades.*;
import jpautil.*;

public class Main {
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();

		// Inserção
		Animal animal = new Animal();
		animal.setNome("Thunder");
		animal.setEspecie("Cachorro");
		animal.setIdade(11);

		Animal animal2 = new Animal();
		animal2.setNome("Lulinha");
		animal2.setEspecie("Cachorro");
		animal2.setIdade(12);

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(animal);
		em.persist(animal2);
		tx.commit();

		Long idThunder = animal.getId();
		Long idLulinha = animal2.getId();

		// Atualização
		tx.begin();
		Animal animalAtualizar = em.find(Animal.class, idThunder);
		animalAtualizar.setIdade(10); 
		tx.commit();

		// Exclusão
		Animal animal2Excluir = em.getReference(Animal.class, idLulinha);
		tx.begin();
		em.remove(animal2Excluir); 
		tx.commit();

		em.close();
		JPAUtil.fechar();
	}
}
package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;
import model.Vendedor;

public class Programa {

	public static void main(String[] args) {

		
		Cliente c1 = new Cliente(null,"Matheus Cavalcante",26,"matheusc.soares@hotmail.com");
		Cliente c2 = new Cliente(null,"Alex Barbosa",50,"alex.barbosa@gmail.com");
		Cliente c3 = new Cliente(null,"Giovanni Torres",35,"giovanni.t@gmail.com");
		Cliente c4 = new Cliente(null,"Max Santos",24,"max.santos@hotmail.com");
		
		Vendedor v1 = new Vendedor(null,"Joel Silva","Distribuidora Jabar","(12)99555-1616","joel.silva@hotmail.com");
		Vendedor v2 = new Vendedor(null,"Carlos Campos","Atacado Garcia","(12)93365-1717","carlos.campos@hotmail.com");
		Vendedor v3 = new Vendedor(null,"Juan Pablo","Lojão do Juan","(11)98444-1818","juan.pablo@hotmail.com");
		Vendedor v4 = new Vendedor(null,"Coronel Talhada","PM Bebidas","(11)99656-1919","coronel.talhada@hotmail.com");
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("trabalho-kaspper");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(c4);
		em.persist(v1);
		em.persist(v2);
		em.persist(v3);
		em.persist(v4);
		
		em.getTransaction().commit();
		System.out.println("Cadastrado com sucesso!");
		
		em.close();
		emf.close();
	}

}

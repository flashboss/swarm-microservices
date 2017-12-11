package it.vige.microservices.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import it.vige.microservices.jpa.Conto;

@Stateless
public class Consulta {

	@PersistenceContext(unitName = "micro")
	private EntityManager em;

	public Conto visualizzaConto(int id) {
		return em.find(Conto.class, id);
	}

	public void creaConto(int id, String name) {
		Conto conto = new Conto();
		conto.setId(id);
		conto.setName(name);
		em.persist(conto);
	}
}

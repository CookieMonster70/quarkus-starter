package com.baloise.codecamp.quarkus.standardentity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class JpaBookService {

	@Inject
	EntityManager em;

	@Transactional
	public List<JpaBook> list() {
		List<JpaBook> result = em.createQuery("select b from JpaBook b", JpaBook.class).getResultList();
		return result;
	}

	public JpaBook findById(Long id) {
		return em.getReference(JpaBook.class, id);
	}

}

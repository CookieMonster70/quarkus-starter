package com.baloise.codecamp.quarkus.standardentity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class JpaAuthorService {

	@Inject
	EntityManager em;

	@Transactional
	public List<JpaAuthor> list() {
		List<JpaAuthor> result = em.createQuery("select b from JpaAuthor b", JpaAuthor.class).getResultList();
		return result;
	}

	@Transactional
	public JpaAuthor findByName(String name) {
		System.out.println("name = " + name);
		TypedQuery<JpaAuthor> query = em.createQuery(
			"SELECT a FROM JpaAuthor a WHERE a.name = ?1", JpaAuthor.class);
		JpaAuthor author = query.setParameter(1, name).getSingleResult();
		return author;
	}

	@Transactional
	public void addAuthor(String name, String surname) {
		JpaAuthor author = new JpaAuthor();
		author.name = name;
		author.surname = surname;
		em.persist(author);
	}

	@Transactional
	public void deleteAll() {
		Query q = em.createQuery("DELETE FROM JpaAuthor");
		q.executeUpdate();
	}

}

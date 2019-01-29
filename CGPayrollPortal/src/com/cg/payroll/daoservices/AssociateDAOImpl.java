package com.cg.payroll.daoservices;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.payroll.beans.Associate;

public class AssociateDAOImpl implements AssociateDAO {

	private EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("JPA-PU");
	@Override
	public Associate save(Associate associate) {
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(associate);
		entityManager.getTransaction().commit();
		entityManager.close();
		return associate;
	}

	@Override
	public boolean update(Associate associate) {
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(associate);
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	}

	@Override
	public Associate findOne(int associateID) {
		return entityManagerFactory.createEntityManager().find(Associate.class, associateID);
	}

	@Override
	public List<Associate> findAll() {
		return entityManagerFactory.createEntityManager().createQuery("from Associate a").getResultList();
	}

}

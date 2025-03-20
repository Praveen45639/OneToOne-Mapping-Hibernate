package com.demo.hiber.dao;

import com.demo.hiber.dto.Child;
import com.hibernate.demo.dao.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

//import com.demo.hiber.dto.Child;
//import com.hibernate.demo.dao.JPAUtil;

public class ChildDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
	EntityManager em = JPAUtil.getFactory().createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void saveChild(Child child) {
		et.begin();
		em.persist(child);
		et.commit();
		System.out.println(child.getName()+" is saved successfully");
	}

}

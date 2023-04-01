package com.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.spring.dto.TicketBooking;

@Component
public class TicketDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void ticketBooking(TicketBooking booking) {
		entityTransaction.begin();
		entityManager.persist(booking);
		entityTransaction.commit();
	}

}

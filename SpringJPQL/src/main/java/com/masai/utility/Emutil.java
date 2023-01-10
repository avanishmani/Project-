package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emutil {
	private static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("accountUnit");
	}
	public static EntityManager provideEM() {
		return emf.createEntityManager();
	}
}

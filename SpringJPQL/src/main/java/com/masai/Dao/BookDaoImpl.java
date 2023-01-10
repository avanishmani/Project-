package com.masai.Dao;

import javax.persistence.EntityManager;

import com.masai.model.Account;
import com.masai.model.BookLibrary;
import com.masai.utility.Emutil;

public class BookDaoImpl implements BookDao {

	@Override
	public BookLibrary info(int Bookid) {
		// TODO Auto-generated method stub
		EntityManager em=Emutil.provideEM();
		
		return em.find(BookLibrary.class, Bookid);
	}

	@Override
	public String CreateBook(BookLibrary book) {
		// TODO Auto-generated method stub
		String msg="Book not Created !";
		EntityManager em=Emutil.provideEM();
		em.getTransaction().begin();
		em.persist(book);
		msg="Book create succesfully !";
		em.getTransaction().commit();
		em.close();
		return msg;
		
	}

	@Override
	public Boolean DeleteBook(int BookID) {
		boolean flag=false;
		EntityManager em=Emutil.provideEM();
		BookLibrary b1=em.find(BookLibrary.class, BookID);
		if(b1!=null) {
			em.getTransaction().begin();
			em.remove(b1);
			flag=true;
			em.getTransaction().commit();
			
		}
		em.close();
		return flag;
	}

	@Override
	public String UpdateBook(int BookID) {
		// TODO Auto-generated method stub
		String msg="Not updated !";
		EntityManager em=Emutil.provideEM();
		BookLibrary ac=em.find(BookLibrary.class, BookID);
		if(ac==null) {
			throw new IllegalArgumentException("Invalid BookID");
		}else {
			em.getTransaction().begin();
			em.merge(ac);
			msg="Book is Updated Now!";
			em.getTransaction().commit();
		}
		em.close();
		return msg;
	}

	

}

package com.pluralsight.bookstore.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;

import com.pluralsight.bookstore.model.Book;

/**
 * Created by ashutosh on 25/7/17.
 */
public class BookRepository {

	@PersistenceContext(unitName = "bookStorePU")
	private EntityManager em;

	@Transactional(SUPPORTS)
	public Book find(@NotNull Long id){
		return em.find(Book.class, id);
	}

	@Transactional(REQUIRED)
	public Book create(@NotNull Book book){
		em.persist(book);
		return book;
	}

	@Transactional(REQUIRED)
	public void delete(@NotNull Long id){
		em.remove(em.getReference(Book.class, id)); // First getting the refernce the book then we are removing the same
	}

	//JPQL using the criteria (like HQL)
	@Transactional(SUPPORTS)
	public List<Book> findAll(){
		TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b ORDER BY b.name", Book.class);
		return query.getResultList();
	}

	@Transactional(SUPPORTS)
	public Long CountAll(){
		TypedQuery<Long> query = em.createQuery("SELECT COUNT(b) FROM Book b", Long.class);
		return query.getSingleResult();
	}
}

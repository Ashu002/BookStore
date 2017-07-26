package com.pluralsight.bookstore.repository;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.pluralsight.bookstore.model.Book;
import com.pluralsight.bookstore.model.Language;
import junit.framework.TestCase;

/**
 * Created by ashutosh on 25/7/17.
 */
	@RunWith(Arquillian.class)
public class BookRepositoryTest {

	@Inject
	private BookRepository bookRepository;

	@Test
	public void create() throws Exception {
		TestCase.assertEquals(Long.valueOf(0),this.bookRepository.CountAll());
	}

	@Deployment
	public static JavaArchive createDeployment() {
		return ShrinkWrap.create(JavaArchive.class)
				.addClass(Book.class)
				.addClass(Language.class)
				.addClass(BookRepository.class)
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
		.addAsManifestResource("META-INF/test-persistence.xml", "persistence.xml");
	}

}

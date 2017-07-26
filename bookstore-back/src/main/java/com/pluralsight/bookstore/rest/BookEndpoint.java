package com.pluralsight.bookstore.rest;

import java.util.List;

import javax.inject.Inject;
import javax.validation.constraints.Min;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pluralsight.bookstore.model.Book;
import com.pluralsight.bookstore.repository.BookRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Created by ashutosh on 27/7/17.
 */
@Path("/books")
@Api("Book")
public class BookEndpoint {

	@Inject
	private BookRepository bookRepository;

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Returns a book by id", response = Book.class)
	@ApiResponses({
			@ApiResponse(code = 200, message = "Book Found"),
			@ApiResponse(code = 404, message = "Book not Found")
	})
	public Book getBook(@PathParam("id") @Min(1) Long id){
		return bookRepository.find(id);
	}

	public Book createBook(Book book){
		return bookRepository.create(book);
	}

	public void deleteBook(Long id){
		bookRepository.delete(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBooks(){
		System.out.println("Heeloooo");
		List<Book> books = bookRepository.findAll();
		if(books.size() == 0){
			return Response.noContent().build();
		}
		return Response.ok(books).build();
	}

	@GET
	@Path("/count")
	public Response countBooks(){
		Long numberOfBook =  bookRepository.countAll();
		if(numberOfBook == 0){
			return Response.noContent().build();
		}
		return Response.ok(numberOfBook).build();
	}
}

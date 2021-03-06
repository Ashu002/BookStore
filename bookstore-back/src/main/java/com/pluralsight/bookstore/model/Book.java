package com.pluralsight.bookstore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by ashutosh on 25/7/17.
 */
@Entity
@ApiModel(description = "Book Resource Representation")
public class Book {

	@Id @GeneratedValue
	@ApiModelProperty("Identifier")
	private Long id;


	@Column(name = "title", length = 200)
	@NotNull
	@Size(min = 1, max = 200)
	@ApiModelProperty("Title of the book")
	private String name;

	@Column(length = 10000)
	@Size(min = 1, max = 10000)
	@ApiModelProperty("Description of the book")
	private String description;

	@Column(name = "unit_cost")
	private Float unitPrice;

	@NotNull
	@Size(min = 1, max = 50)
	private String isbn;

	@Column(name = "publication_date")
	@Temporal(TemporalType.DATE)
	@Past
	private Date publicationDate;

	@Column(name = "nb_of_pages")
	private Integer nbOfPages;

	@Column(name = "image_url")
	private String imgUrl;

	private Integer language;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Integer getNbOfpages() {
		return nbOfPages;
	}

	public void setNbOfpages(Integer nbOfPages) {
		this.nbOfPages = nbOfPages;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Integer getLanguage() {
		return language;
	}

	public void setLanguage(Integer language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", unitPrice=" + unitPrice +
				", isbn='" + isbn + '\'' +
				", publicationDate=" + publicationDate +
				", noOfpages=" + nbOfPages +
				", ingUrl='" + imgUrl + '\'' +
				", language=" + language +
				'}';
	}
}

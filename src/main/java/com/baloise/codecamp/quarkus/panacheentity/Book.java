package com.baloise.codecamp.quarkus.panacheentity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book extends PanacheEntity {
	public Long id;
	public String title;
	public String author;

	public static void add(String title, String author) {
		Book book = new Book();
		book.title = title;
		book.author = author;
		book.persist();
	}

}

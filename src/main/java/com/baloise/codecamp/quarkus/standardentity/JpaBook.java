package com.baloise.codecamp.quarkus.standardentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class JpaBook {
	@Id
	@GeneratedValue
	public Long id;
	public String title;
	public String author;

}

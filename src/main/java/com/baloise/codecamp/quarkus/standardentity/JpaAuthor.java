package com.baloise.codecamp.quarkus.standardentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class JpaAuthor {
	@Id
	@GeneratedValue
	public Long id;
	public String name;
	public String surname;

}

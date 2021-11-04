package com.baloise.codecamp.quarkus.standardentity;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class JpaAuthor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String name;
	public String surname;

}

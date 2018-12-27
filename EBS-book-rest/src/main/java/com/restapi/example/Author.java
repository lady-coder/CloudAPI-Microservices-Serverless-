package com.restapi.example;

import java.util.Date;

import lombok.Data;

@Data
public class Author {
	
	private String id;
	private String name;
	private Date dateOfBirth;
	private String placeOfBirth;
	private Date dateOfDeath;
	private String placeOfDeath;

}

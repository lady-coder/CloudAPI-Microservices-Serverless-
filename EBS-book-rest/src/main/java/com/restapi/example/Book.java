package com.restapi.example;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String publisher;
	private int year;
	private float price;
	private String author;
	
	
	
}

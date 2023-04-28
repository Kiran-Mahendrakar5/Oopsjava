package com.xworkz.movie.dto;

public class MovieDto {
	
	private String name;
	private String producer;
	private String director;
	private int Collection;
	
	
	@Override
	public String toString() {
		return "MovieDto [name=" + name + ", producer=" + producer + ", director=" + director + ", Collection="
				+ Collection+ "]";
	}
	public MovieDto(String name, String producer, String director, int collection) {
		super();
		this.name = name;
		this.producer = producer;   //parameterise constructor
		this.director = director;
		Collection = collection;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getCollection() {
		return Collection;
	}
	public void setCollection(int collection) {
		Collection = collection;
	}
	
	
	

}

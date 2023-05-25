package com.xworkz.tree.dto;

public class TreeDto {
	private String Name;
	private int age;
	private int fruits;
	private int stream;

	public TreeDto() {
		super();
	}

	@Override
	public String toString() {
		return "TreeDto [Name=" + Name + ", age=" + age + ", fruits=" + fruits + ", stream=" + stream + "]";
	}

	public TreeDto(String name, int age, int fruits, int stream) {
		super();
		Name = name;
		this.age = age;
		this.fruits = fruits;
		this.stream = stream;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getFruits() {
		return fruits;
	}

	public void setFruits(int fruits) {
		this.fruits = fruits;
	}

	public int getStream() {
		return stream;
	}

	public void setStream(int stream) {
		this.stream = stream;
	}

}

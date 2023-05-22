package com.xworkz.books;

import com.xworkz.books.dao.BooksDao;
import com.xworkz.books.dao.BooksDaoTwo;
import com.xworkz.books.dto.BooksDto;

public class booksRunner {
	public static void main(String[] args) {
		BooksDto dto = new BooksDto("dictionary", "Red", "allMeaning", "Classmate", 500);
		BooksDto dto1 = new BooksDto("Akbar Birbal Stories.", "white", "story", "standard", 250);
		BooksDaoTwo dao2 = new BooksDaoTwo();
		BooksDao dao = new BooksDao();
		dao.save(dto);
		dao.save(dto1);
		dao2.save(dto1);
		System.out.println(".....................................");

		dao.find("dictionary");
		dao.find("white");
		dao2.find("red");

		dao.updateNameByColor("dictionary", "mixedColour");
		dao2.updateNameByColor("Akbar Birbal Stories", "mixedWhite");
		System.out.println("-----------dao1-----------");
		boolean ref = dao.deleteByname("mixedColour");
		System.out.println(ref);
		dao.readAll();
		System.out.println("--------------------------------");
		boolean ref1 = dao2.deleteByname("story");
		System.out.println(ref1);
		System.out.println("---------------------");

		BooksDto[] classbook = dao2.readAll();
		for (int i = 0; i < classbook.length; i++) {
			if (classbook[i] != null) {
				System.out.println(classbook[i]);
			}
			
			}
			
			
			
			
		}

	}


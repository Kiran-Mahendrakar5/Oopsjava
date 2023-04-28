package com.xworkz.movie.dao;

import com.xworkz.movie.dto.MovieDto;

public class MovieDao {

	MovieDto[] tourn = new MovieDto[10];

	public boolean saveMovie(MovieDto kalki) {

		if (kalki != null) {
			for (int i = 0; i < tourn.length; i++) {
				if (kalki.getName() != null) {
					if (tourn[i] == null) {
						tourn[i] = kalki;
						System.out.println("Sucessfully initialize");
						return true;
					}
					System.out.println("no enough space");
					return false;
				}
				System.out.println("baazar get name is null add the value");
				return false;

			}
			System.out.println("it continues loop");
			return false;

		}
		System.out.println(" check null ");
		return false;

	}

	public MovieDto[] readAllMovies() {
		return tourn;

	}

}

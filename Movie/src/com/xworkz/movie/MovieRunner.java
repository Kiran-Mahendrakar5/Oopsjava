package com.xworkz.movie;

import com.xworkz.movie.dao.MovieDao;
import com.xworkz.movie.dto.MovieDto;

public class MovieRunner {
	public static void main(String[] args) {
		MovieDto dto = new MovieDto("Bazaar", "ThimmeGowda", "suni", 1000000);

		MovieDao dao = new MovieDao();
		MovieDto dto1 = new MovieDto("Bazaar", "ThimmeGowda", "suni", 1000000);
		MovieDto dto2 = new MovieDto(null, "ThimmeGowda", "suni", 1000000);//baazar value is null add value
		MovieDto dto3 = new MovieDto(null, null, null, 100000);


		dao.saveMovie(dto);
		System.out.println(".........test.........");
		dao.saveMovie(dto1);
		System.out.println(".........test1.........");
		dao.saveMovie(dto2);
		System.out.println(".........test2.........");
		dao.saveMovie(dto3);
		

		MovieDto[] ref = dao.readAllMovies();
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] != null) { // removing null
				System.out.println(ref[i]);

			}

		}

	}

}

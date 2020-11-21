package com.ranya.movies.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ranya.movies.entities.Movie;

public interface MovieService {
	
	Movie saveMovie(Movie m);
	Movie updateMovie(Movie m);
	void deleteMovie(Movie m);
	 void deleteMovieById(Long id);
	 Movie getMovie(Long id);
	List<Movie> getAllMovies();
	Page<Movie> getAllMoviesParPage(int page, int size);



}

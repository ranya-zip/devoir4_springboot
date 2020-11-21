package com.ranya.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ranya.movies.entities.Movie;
import com.ranya.movies.repos.MovieRepository;


@Service
public class MovieServiceimpl implements MovieService{
	@Autowired
	MovieRepository movieRepository;

	@Override
	public Movie saveMovie(Movie m) {
		return movieRepository.save(m);
		}

	@Override
	public Movie updateMovie(Movie m) {
		return movieRepository.save(m);
	}

	@Override
	public void deleteMovie(Movie m) {
		 movieRepository.delete(m);
		
	}

	@Override
	public void deleteMovieById(Long id) {
		movieRepository.deleteById(id);
		
	}

	@Override
	public Movie getMovie(Long id) {
		return movieRepository.findById(id).get();
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Page<Movie> getAllMoviesParPage(int page, int size) {
		return movieRepository.findAll(PageRequest.of(page, size));
		
	}
	
	

}

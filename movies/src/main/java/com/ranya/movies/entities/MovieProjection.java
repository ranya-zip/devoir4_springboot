package com.ranya.movies.entities;

public interface MovieProjection {
	@Projection(name = "nomMovie", types = { Movie.class })
	public interface MovieProjection {
	public String getNomMovie();
	}
}

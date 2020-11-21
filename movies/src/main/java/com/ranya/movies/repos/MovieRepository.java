package com.ranya.movies.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranya.movies.entities.Movie;

@RepositoryRestResource(path = "rest")
public interface MovieRepository extends JpaRepository<Movie, Long> {

}

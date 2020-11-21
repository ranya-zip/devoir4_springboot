package com.ranya.movies.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idMovie;
	private String nomMovie;
	private double prixMovie;
	private Date dateSortie;
	@ManyToOne
	private Directory directory;
	
	
	public Directory getDirectory() {
		return directory;
	}





	public void setDirectory(Directory directory) {
		this.directory = directory;
	}





	public Movie() {
		super();
		
	}
	
	
	
	
	
	public Movie(String nomMovie, double prixMovie, Date dateSortie) {
		super();
		this.nomMovie = nomMovie;
		this.prixMovie = prixMovie;
		this.dateSortie = dateSortie;
	}





	public long getIdMovie() {
		return idMovie;
	}
	public void setIdMovie(long idMovie) {
		this.idMovie = idMovie;
	}
	public String getNomMovie() {
		return nomMovie;
	}
	public void setNomMovie(String nomMovie) {
		this.nomMovie = nomMovie;
	}
	public double getPrixMovie() {
		return prixMovie;
	}
	public void setPrixMovie(double prixMovie) {
		this.prixMovie = prixMovie;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}





	@Override
	public String toString() {
		return "Movie [idMovie=" + idMovie + ", nomMovie=" + nomMovie + ", prixMovie=" + prixMovie + ", dateSortie="
				+ dateSortie + "]";
	}
	
	









}

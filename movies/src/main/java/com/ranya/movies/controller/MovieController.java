package com.ranya.movies.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ranya.movies.entities.Movie;
import com.ranya.movies.service.MovieService;
import com.sun.el.parser.ParseException;



@Controller
public class MovieController {
	@Autowired
	MovieService MovietService;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "createMovie";
	}
	@RequestMapping("/saveMovie")
	public String saveMovie(@ModelAttribute("movie")Movie movie ,
	                         @RequestParam("date") String date,
	                         ModelMap modelMap) throws
	ParseException
	{
	//conversion de la date
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateCreation = dateformat.parse(String.valueOf(date));
	 movies.setDateCreation(dateCreation);

	Movie saveMovie = movieService.saveMovie(movie);
	String msg ="movie enregistré avec Id "+saveMovie.getIdMovie();
	modelMap.addAttribute("msg", msg);
	return "createMovie";
	}
	
	@RequestMapping("/ListeMovies")
	public String listeMovies(ModelMap modelMap,
	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)
	{
	Page<Movie> mvs = movieService.getAllMoviesParPage(page, size);
	modelMap.addAttribute("Movies", mvs);
	 modelMap.addAttribute("pages", new int[mvs.getTotalPages()]);
	modelMap.addAttribute("currentPage", page);
	return "listeMovies";
	}
	
	

	
@RequestMapping("/supprimerMovie")
public String supprimerMovie(@RequestParam("id") Long id,
 ModelMap modelMap)
{
	
movieService.deleteMovieById(id);
List<Movie> mvs = movieService.getAllMovies();
modelMap.addAttribute("movies", mvs);
return "listeMovies";
}
	
@RequestMapping("/modifierMovies")
public String editerMovie(@RequestParam("id") Long id,ModelMap modelMap)
{
	Movie m= movieService.getMovie(id);
modelMap.addAttribute("Movie", m);
return "editerMovie";
}
     @RequestMapping("/updateMovie")
    public String updateMovie(@ModelAttribute("Movie") Movie movie,
                              @RequestParam("date") String date,
                              ModelMap modelMap) throws ParseException
    {
    //conversion de la date
     SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
     Date dateCreation = dateformat.parse(String.valueOf(date));
     Movie.setDateCreation(dateCreation);

     movieService.updateMovie(Movie);
     List<Movie> mvs = movieService.getAllMovies();
     modelMap.addAttribute("Movies", mvs);
    return "listeMovies";
    }
	
     @RequestMapping("/supprimerMovies")
     public String supprimerMovie(@RequestParam("id") Long id,
     ModelMap modelMap,
     @RequestParam (name="page",defaultValue = "0") int page,
     @RequestParam (name="size", defaultValue = "2") int size)
     {
    	 movieService.deleteMovieById(id);
     Page<Movie>mvs = movieService.getAllMoviesParPage(page,size);
     modelMap.addAttribute("movies", mvs);
     modelMap.addAttribute("pages", new int[mvs.getTotalPages()]);
     modelMap.addAttribute("currentPage", page);
     modelMap.addAttribute("size", size);
     return "listeMovies";
     }

	
	
	

}

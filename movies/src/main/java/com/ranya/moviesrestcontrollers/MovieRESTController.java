package com.ranya.movies.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ranya.movies.entities.Produit;
import com.ranya.movies.service.ProduitService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class MovieRESTController {
@Autowired
MovieService movieService;
@RequestMapping(method = RequestMethod.GET)
public List<Movie> getAllMovies() {
return movieService.getAllMovies();
}
}
package io.microservices.learning.movieinfoservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.microservices.learning.movieinfoservice.dao.movieInfoRepository;
import io.microservices.learning.movieinfoservice.model.MovieItem;

@RestController
@RequestMapping("/movieItem")
public class MovieInfoResources {

	@Autowired
	private movieInfoRepository repo;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/{movieid}")
	public ResponseEntity<?> getMovieList(@PathVariable("movieid") Integer movieid){
		MovieItem m1= repo.findById(movieid).get();
		return ResponseEntity.ok(m1);
	}
	
	
}

package com.sayan.movie.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")

public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable String imdbId) {
        // return new ResponseEntity<Optional<Movie>>(movieService.movieById(id),
        // HttpStatus.OK);
        return new ResponseEntity<Optional<Movie>>(movieService.movieById(imdbId), HttpStatus.OK);
    }
}

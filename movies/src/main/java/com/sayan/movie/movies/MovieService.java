package com.sayan.movie.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    // Note: This methos is used to get a movie by its mongodb id
    // public Optional<Movie> movieById(ObjectId id) {
    // return movieRepository.findById(id);
    // }

    public Optional<Movie> movieById(String imdbId) {
        return movieRepository.findMoviesByImdbId(imdbId);
    }

}

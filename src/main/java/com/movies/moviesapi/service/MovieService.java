package com.movies.moviesapi.service;

import com.movies.moviesapi.model.Movie;
import com.movies.moviesapi.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;

    public List<Movie> allMovies(){
        return movieRepo.findAll();
    }

    public Optional<Movie> movieById(String imdbId){
        return movieRepo.findMovieByImdbId(imdbId);
    }
}

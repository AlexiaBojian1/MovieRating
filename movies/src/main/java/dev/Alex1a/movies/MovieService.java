package dev.Alex1a.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {


    @Autowired
    private MovieReposiory movieReposiory;
    public List<Movie> allMovies(){
        return movieReposiory.findAll();
    }
}

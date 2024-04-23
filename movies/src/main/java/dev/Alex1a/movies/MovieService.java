package dev.Alex1a.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {


    @Autowired
    private MovieReposiory movieReposiory;
    public List<Movie> allMovies(){
        return movieReposiory.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieReposiory.findMovieByimdbId(imdbId);
    }
}

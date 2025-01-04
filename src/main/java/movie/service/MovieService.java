package movie.service;

import lombok.RequiredArgsConstructor;
import movie.dto.MovieRequest;
import movie.dto.MovieResponse;
import movie.entity.Movie;
import movie.mapper.MovieMapper;
import movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service

public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private MovieMapper movieMapper;


    public List<MovieResponse> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        return movieMapper.toMovieResponseList(movies);
    }

    public MovieResponse findMovieById(Long id) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("Movie not found"));
        return movieMapper.toMovieResponse(movie);
    }

    public void createMovie(@RequestBody MovieRequest movieRequest) {
        movieRepository.save(movieMapper.toMovie(movieRequest));
    }


    public void updateMovie(Long id, MovieRequest movieRequest) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("Movie not found"));
        movieMapper.toMovie(movieRequest, movie);
        movieRepository.save(movie);

    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}


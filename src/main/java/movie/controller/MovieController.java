package movie.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import movie.dto.MovieRequest;
import movie.dto.MovieResponse;
import movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/all/movies")
    @Operation(summary = "Get all movies", description = "This endpoint get all movies.")
    List<MovieResponse> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/findById/{id}")
    @Operation(summary = "Get a movie", description = "This endpoint get a movie.")
    MovieResponse findMovieById(@PathVariable Long id) {
        return movieService.findMovieById(id);
    }

    @PostMapping("/create")
    @Operation(summary = "Create a new movie", description = "This endpoint creates a new movie record.")
    void createMovie(@RequestBody @Valid MovieRequest movieRequest) {
        movieService.createMovie(movieRequest);
    }

    @PutMapping("/update/{id}")
    @Operation(summary = "Update movie", description = "This endpoint update movie.")
    void updateMovie(@PathVariable Long id, @RequestBody MovieRequest movieRequest) {
        movieService.updateMovie(id, movieRequest);
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Delete movie", description = "This endpoint delete movie.")
    void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
    }


}

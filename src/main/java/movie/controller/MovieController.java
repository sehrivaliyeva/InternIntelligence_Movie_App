package movie.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import movie.dto.MovieRequest;
import movie.dto.MovieResponse;
import movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/movie")
@Tag(name = "Movie APIs ")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/all/movies")
    List<MovieResponse> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/findById/{id}")
    MovieResponse findMovieById(@PathVariable Long id) {
        return movieService.findMovieById(id);
    }

    @PostMapping("/create")
    void createMovie(@RequestBody MovieRequest movieRequest) {
        movieService.createMovie(movieRequest);
    }

    @PutMapping("/update/{id}")
    void updateMovie(@PathVariable Long id, @RequestBody MovieRequest movieRequest) {
        movieService.updateMovie(id, movieRequest);
    }
  @DeleteMapping("/delete/{id}")
    void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
  }


}

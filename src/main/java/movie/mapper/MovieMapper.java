package movie.mapper;

import movie.dto.MovieRequest;
import movie.dto.MovieResponse;
import movie.entity.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    List<MovieResponse> toMovieResponseList(List<Movie> moviesEntities);

    Movie toMovie(MovieRequest movieRequest);

    MovieResponse toMovieResponse(Movie movie);

 void toMovie(MovieRequest movieRequest, @MappingTarget Movie movie);

}

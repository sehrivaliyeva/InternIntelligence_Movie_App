package movie.dto;

import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieResponse {
    private Long id;
    private String title;
    private String director;
    private String releaseYear;
    private String genre;
    private String IMDb;
}

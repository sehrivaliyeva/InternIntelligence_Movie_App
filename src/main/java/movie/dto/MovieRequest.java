package movie.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieRequest {
    private String title;
    private String director;
    private String releaseYear;
    private String genre;
    private String IMDb;
}

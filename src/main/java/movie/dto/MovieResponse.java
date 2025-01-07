package movie.dto;

import lombok.*;

@Getter
@Setter
public class MovieResponse {

    private String title;
    private String director;
    private String release_year;
    private String genre;
    private String IMDb;


}

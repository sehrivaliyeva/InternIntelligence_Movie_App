package movie.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
public class MovieRequest {

    private String title;
    private String director;
    private String release_year;
    private String genre;
    private String IMDb;
}
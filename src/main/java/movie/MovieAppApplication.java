package movie;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "The Movie App",
                description = "Backend Rest APIs for Movie Application"

        )
)
public class MovieAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieAppApplication.class, args);
    }

}

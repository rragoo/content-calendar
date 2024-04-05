package dev.Test.contentcalendar;

import dev.Test.contentcalendar.model.Content;
import dev.Test.contentcalendar.model.Status;
import dev.Test.contentcalendar.model.Type;
import dev.Test.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//	@Bean
//	CommandLineRunner commandLineRunner(ContentRepository repository){
//		return args -> {
//			Content content = new Content(
//					null,
//					"My First blog post!",
//					"My first blog description",
//					Status.IDEA,
//					Type.ARTICLE,
//					LocalDateTime.now(),
//					null,
//					""
//			);
//			repository.save(content);
//		};
//
//	}

}

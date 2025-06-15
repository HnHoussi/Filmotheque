package fr.eni.ecole.filmotheque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fr.eni.ecole.filmotheque.controller.FilmController;

@SpringBootApplication
public class FilmothequeApplication {
    public static void main(String[] args) {
        SpringApplication.run(FilmothequeApplication.class, args);
    }
}
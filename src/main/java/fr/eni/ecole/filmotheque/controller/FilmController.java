package fr.eni.ecole.filmotheque.controller;

import fr.eni.ecole.filmotheque.bll.FilmService;
import fr.eni.ecole.filmotheque.bo.Film;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class FilmController {
    private FilmService filmService;

    // injection with constructor
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    public void afficherFilms() {

        System.out.println("Tous les film");
        List<Film> films = filmService.consulterFilms();
        films.forEach(System.out::println);
    }

    public void afficherUnFilm(long id) {
        System.out.println("Film Par Id");
        Film film = filmService.consulterFilmParId(id);
        System.out.println(film);
    }
}

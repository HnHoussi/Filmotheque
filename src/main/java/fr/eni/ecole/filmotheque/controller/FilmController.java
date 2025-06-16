package fr.eni.ecole.filmotheque.controller;

import fr.eni.ecole.filmotheque.bll.FilmService;
import fr.eni.ecole.filmotheque.bo.Film;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//commit de test
@Controller
public class FilmController {
    private FilmService filmService;

    //injection with constructor
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/index.html")
    public String homePage() {

        return "index";
    }

    @GetMapping("/films")
    public String filmsPage(Model model) {
        List<Film> films = filmService.consulterFilms();
        model.addAttribute("films", films);

        return "films";
    }
    @GetMapping("/films/details")
    public String detailsPage(@RequestParam long id, Model model) {
        Film film = filmService.consulterFilmParId(id);
        model.addAttribute("film", film);

        return "filmDetails";
    }

//    public void afficherFilms() {
//
//        System.out.println("Tous les film");
//        List<Film> films = filmService.consulterFilms();
//        films.forEach(System.out::println);
//    }
//
//    public void afficherUnFilm(long id) {
//        System.out.println("Film Par Id");
//        Film film = filmService.consulterFilmParId(id);
//        System.out.println(film);
//    }

}

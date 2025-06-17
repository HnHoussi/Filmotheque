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

    //Afficher tous les films
    @GetMapping("/films")
    public String filmsPage(Model model) {
        List<Film> films = filmService.consulterFilms();
        model.addAttribute("films", films);

        return "films";
    }

    //afficher le film par id en cliquant sur le bouton Détails
    @GetMapping("/films/details")
    public String detailsPage(@RequestParam long id, Model model) {
        Film film = filmService.consulterFilmParId(id);
        //ajouter le param id de film dans l'url
        model.addAttribute("film", film);

        if (film != null) {
            return "filmDetails";
        } else {
            return "redirect:/films";
        }
    }

}

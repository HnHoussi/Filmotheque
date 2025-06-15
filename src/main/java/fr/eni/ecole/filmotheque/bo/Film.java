package fr.eni.ecole.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Film {
    private long id;
    private String titre;
    private int annee;
    private int duree;
    private String synopsis;
    private Participant realisateur;
    private List<Participant> acteurs;
    private Genre genre;
    private List<Avis> avis;

    //default constructor
    public Film() {
        this.acteurs = new ArrayList<>();
        this.avis = new ArrayList<>();
    }

    // constructor with all attributes
    public Film(long id, String titre, int annee, int duree, String synopsis, Participant realisateur, List<Participant> acteurs, Genre genre, List<Avis> avis) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
        this.realisateur = realisateur;
        this.acteurs = new ArrayList<>();
        this.genre = genre;
        this.avis = new ArrayList<>();
    }

    // constructor with all attributes except the id
    public Film(String titre, int annee, int duree, String synopsis, Participant realisateur, List<Participant> acteurs, Genre genre, List<Avis> avis) {
        this(0, titre, annee, duree, synopsis, realisateur, acteurs, genre, avis);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Participant getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Participant realisateur) {
        this.realisateur = realisateur;
    }

    public List<Participant> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Participant> acteurs) {
        this.acteurs = acteurs;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Avis> getAvis() {
        return avis;
    }

    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", annee=" + annee +
                ", duree=" + duree +
                ", synopsis='" + synopsis + '\'' +
                ", realisateur=" + realisateur +
                ", acteurs=" + acteurs +
                ", genre=" + genre +
                ", avis=" + avis +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Film film)) return false;
        return id == film.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

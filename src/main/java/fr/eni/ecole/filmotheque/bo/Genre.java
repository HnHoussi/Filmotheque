package fr.eni.ecole.filmotheque.bo;

import java.util.List;
import java.util.Objects;

public class Genre {
    private long id;
    private String titre;


    //default constructor
    public Genre() {
    }

    //constructor with all attributes
    public Genre(long id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    //constructor with all attributes except the id
    public Genre(String titre) {
        this.titre = titre;
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

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Genre genre)) return false;
        return id == genre.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

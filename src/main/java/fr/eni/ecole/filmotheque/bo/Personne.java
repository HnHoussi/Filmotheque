package fr.eni.ecole.filmotheque.bo;

import java.util.Objects;

public abstract class Personne {
    private long id;
    private String nom;
    private String prenom;

    //default constructor
    public Personne() {
    }

    //constructor with all attributes
    public Personne(long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    //constructor with all attributes except the id

    public Personne(String nom, String prenom) {
        this(0,nom,prenom);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Personne personne)) return false;
        return id == personne.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

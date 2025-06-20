package fr.eni.ecole.filmotheque.bo;

import java.util.Objects;

public class Avis {
    private long id;
    private int note;
    private String commentaire;
    private Membre  membre;


    //default constructor
    public Avis() {
    }

    //Constructor with all attributes
    public Avis(long id, int note, String commentaire, Membre membre) {
        this.id = id;
        this.note = note;
        this.commentaire = commentaire;
        this.membre = membre;
    }

    //constructor with all attributes expect the id
    public Avis(int note, String commentaire, Membre membre) {
        this(0,  note, commentaire, membre);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    @Override
    public String toString() {
        return "Avis{" +
                "id=" + id +
                ", note=" + note +
                ", commentaire='" + commentaire + '\'' +
                ", membre=" + membre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Avis avis)) return false;
        return id == avis.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

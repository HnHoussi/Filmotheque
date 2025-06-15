package fr.eni.ecole.filmotheque.bo;

import java.util.List;

public class Membre extends Personne {
    private String pseudo;
    private String motDePasse;
    private Boolean admin = false;
    //private List<Avis> avis;

    //default constructor
    public Membre() {
    }

    //constructor with all attributes
    public Membre(String pseudo, String motDePasse, Boolean admin) {
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = admin;
    }

    //constructor with all attributes and parent attributes
    public Membre(long id, String nom, String prenom, String pseudo, String motDePasse, Boolean admin) {
        this(pseudo, motDePasse, admin);
        super.setId(id);
    }

    //constructor with all attributes and parent attributes except the id
    public Membre(String nom, String prenom, String pseudo, String motDePasse, Boolean admin) {
        this(pseudo, motDePasse, admin);
        super.setNom(nom);
        super.setPrenom(prenom);
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Boolean isAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Membre{" +
                "pseudo='" + pseudo + '\'' +
                ", admin=" + admin +
                '}';
    }


}

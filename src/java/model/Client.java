/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 1795891
 */
public class Client {
        private  int  id_con ;
        private String utilisateur;
        private String  adresse ;
        private String  email ;
        private String motPasse ;

    public Client() {
    }

        
    public Client(int id_con, String utlisateur, String adresse, String email, String motPasse) {
        this.id_con = id_con;
        this.utilisateur = utlisateur;
        this.adresse = adresse;
        this.email = email;
        this.motPasse = motPasse;
    }

    public Client(String utlisateur, String adresse, String email, String motPasse) {
        this.utilisateur = utlisateur;
        this.adresse = adresse;
        this.email = email;
        this.motPasse = motPasse;
    }

    public int getId_con() {
        return id_con;
    }

    public void setId_con(int id_con) {
        this.id_con = id_con;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }
    
        
    
    
}

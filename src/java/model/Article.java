/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Logger;

/**
 *
 * @author 1795891
 */
public class Article {
    private String id;
    private String nomArticle;
    private String categorie;
    private String couleur;
    private String taille;
    private int quantite;
    private double prix ;
    private String image;
    private String genre;
    private String description;

    public Article() {
    }

    public Article(String id, String nomArticle, int quantite, double prix) {
        this.id = id;
        this.nomArticle = nomArticle;
        this.quantite = quantite;
        this.prix = prix;
    }

    public Article(String id, String nomArticle, String couleur, String taille, double prix, String image, String genre) {
        this.id = id;
        this.nomArticle = nomArticle;
        this.couleur = couleur;
        this.taille = taille;
        this.prix = prix;
        this.image = image;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
  
    
    
}

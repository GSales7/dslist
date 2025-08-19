package com.devsuperior.dslist.com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

//Essa notation @Entity configura a classe JAVA para que ela seja equivalente a uma tabela do banco relacional
@Entity
@Table(name ="tb_game") //personaliza o nome da tabela do banco
public class Game {
    @Id //Torna o id a chave primária da tablea do banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Torna o ID autoincrementado pelo banco
    private long id;
    private String title;
    //A palavra year é reservada do SQL então a gente muda o nome dela lá no banco pra não dar problema
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    // O item String pode ser algo de até 4 GB, porém, se não colocamos nada a JPA vai entender que é pra mapear ela
    // Pra um campo no banco de até 255 caracters. Daí temos que usar um macete pra e a JPA genre como um campo de texto
    // E não um var char de 255 caracteres.
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game(){

    }

    public Game(long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

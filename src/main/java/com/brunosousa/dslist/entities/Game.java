package com.brunosousa.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game() {}

    public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public Game setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Game setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public Game setYear(Integer year) {
        this.year = year;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Game setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public Game setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Game setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Game setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public Game setLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Game other = (Game) obj;
        return Objects.equals(id, other.id);
    }
}

package com.sales.springboot_api.dto;

import com.sales.springboot_api.entities.Element;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "tb_game")
public class ElementMinDTO {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "game_year")
    private Integer year;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "short_desc", columnDefinition = "TEXT")
    private String shortDesc;

    // Constructor
    public ElementMinDTO() {

    }

    public ElementMinDTO(Element entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDesc = entity.getShortDesc();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDesc() {
        return shortDesc;
    }

}

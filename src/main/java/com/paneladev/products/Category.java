package com.paneladev.products;

import java.time.LocalDateTime;

public class Category {

    private Long id;
    private String name;
    private String slug;
    private String image;
    private LocalDateTime creationAt;
    private LocalDateTime updatedAt;

    public Category(Long id, String name, String slug, String image, LocalDateTime creationAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.image = image;
        this.creationAt = creationAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getCreationAt() {
        return creationAt;
    }

    public void setCreatedAt(LocalDateTime creationAt) {
        this.creationAt = creationAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}

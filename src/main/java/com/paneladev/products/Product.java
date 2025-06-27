package com.paneladev.products;

import java.time.LocalDateTime;
import java.util.List;

public class Product {

    private Long id;
    private String title;
    private Long price;
    private String description;
    private String slug;
    private Category category;
    private List<String> images;
    private LocalDateTime creationAt;
    private LocalDateTime updatedAt;

    public Product(Long id, String title, Long price, String description, String slug, Category category, List<String> images, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.slug = slug;
        this.category = category;
        this.images = images;
        this.creationAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
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

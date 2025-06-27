package com.paneladev.products;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final List<Product> products;

    public ProductService() {
        this.products = loadProducts();
    }

    private List<Product> loadProducts() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        try (InputStream is = new ClassPathResource("products.json").getInputStream()) {
            return mapper.readValue(is, new TypeReference<List<Product>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}


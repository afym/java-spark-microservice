package com.afym.application;

import com.afym.model.entity.Product;
import com.afym.model.service.ProductService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductLocalService implements ProductService{
    private List<Product> products;

    public ProductLocalService(List<Product> products) {
        this.products = products;
    }

    @Override
    public List<Product> orderByName() {
        Collections.sort(this.products, Comparator.comparing(Product::getName));
        return null;
    }
}

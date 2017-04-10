package com.afym.application;

import com.afym.model.entity.Product;
import com.afym.model.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductLocalRepository implements ProductRepository {

    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("PO011", "Keyboard", 44.45));
        products.add(new Product("PO012", "Monitor", 19.22));
        products.add(new Product("PO013", "Mouse", 22.33));
        products.add(new Product("PO014", "Printer", 73.99));
        products.add(new Product("PO015", "CPU", 32.11));
        products.add(new Product("PO016", "Wire", 12.99));
        products.add(new Product("PO017", "Disk SSD", 45.22));
        products.add(new Product("PO018", "CD room", 98.22));
        products.add(new Product("PO019", "USB 5GB", 23.22));
        products.add(new Product("PO010", "Pencil", 32.22));
        products.add(new Product("PO011", "Cover", 33.44));
        products.add(new Product("PO012", "Phones", 12.23));
        products.add(new Product("PO013", "Case", 44.22));
        return products;
    }
}

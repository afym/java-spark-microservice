package com.afym.model.repository;

import com.afym.model.entity.Product;
import java.util.List;

public interface ProductRepository {
    List<Product> getProducts();
}

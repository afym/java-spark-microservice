package com.afym.model.service;

import com.afym.model.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> orderByName();
}

package com.afym;

import com.afym.application.ProductLocalRepository;
import com.afym.lib.RestResponse;
import com.afym.model.entity.Product;
import com.google.gson.Gson;

import static spark.Spark.*;

public class EntryPoint {
    public static void main(String[] args) {
        get("/", (request, response) -> "Welcome to Spark micro framework");

        get("/v1/products", (request, response) -> {
            response.type("application/json");
            ProductLocalRepository repository = new ProductLocalRepository();
            RestResponse<Product> restResponse = new RestResponse<Product>();
            restResponse.setError(false);
            restResponse.setMessage("There was no error");
            restResponse.setData(repository.getProducts());
            Gson gson = new Gson();
            return gson.toJson(restResponse);
        });
    }
}

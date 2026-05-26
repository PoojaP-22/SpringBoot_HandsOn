package com.eduhub.eduhub_backend.Component;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
    public String getProduct(){
        return "Apple, Mango, Banana";
    }
}

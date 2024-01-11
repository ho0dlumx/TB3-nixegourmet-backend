package com.emse.spring.automacorp.mapper;

import com.emse.spring.automacorp.dto.ProductDto;
import com.emse.spring.automacorp.model.Products;

public class ProductMapper {

    public static ProductDto toDto(Products product) {
        ProductDto dto = new ProductDto();
        dto.setProductID(product.getProductID());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setPrice(product.getPrice());
        dto.setImg(product.getImg());
        return dto;
    }

    public static Products toEntity(ProductDto dto) {
        Products product = new Products();
        product.setProductID(dto.getProductID());
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setImg(dto.getImg());
        return product;
    }

    public static void updateEntity(Products product, ProductDto dto) {
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setImg(dto.getImg());
    }
}

package com.emse.spring.automacorp.service;

import com.emse.spring.automacorp.dao.ProductsDao;
import com.emse.spring.automacorp.dto.ProductDto;
import com.emse.spring.automacorp.mapper.ProductMapper;
import com.emse.spring.automacorp.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductsDao productsDao;

    public List<ProductDto> findAll() {
        return productsDao.findAll().stream()
                .map(ProductMapper::toDto)
                .collect(Collectors.toList());
    }

    public ProductDto findById(Long id) {
        Products product = productsDao.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        return ProductMapper.toDto(product);
    }

    public ProductDto create(ProductDto productDto) {
        Products product = ProductMapper.toEntity(productDto);
        product = productsDao.save(product);
        return ProductMapper.toDto(product);
    }

    public ProductDto update(Long id, ProductDto productDto) {
        Products product = productsDao.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        ProductMapper.updateEntity(product, productDto);
        product = productsDao.save(product);
        return ProductMapper.toDto(product);
    }

    public void delete(Long id) {
        productsDao.deleteById(id);
    }
}

package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsDao extends JpaRepository<Products, Long> {

}
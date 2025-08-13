package com.bb.shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bb.shopping.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
  List<Product> findByNameContainingIgnoreCase(String q);
  @Query("select p from Product p where upper(p.tags) like %?1%")
  List<Product> findByTag(String tag);
}


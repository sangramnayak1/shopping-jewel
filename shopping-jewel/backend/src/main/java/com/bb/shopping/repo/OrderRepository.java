package com.bb.shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bb.shopping.model.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
  List<Order> findByUserId(Long userId);
}


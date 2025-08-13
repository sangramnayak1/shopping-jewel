package com.bb.shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bb.shopping.model.CartItem;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
  List<CartItem> findByUserId(Long userId);
  void deleteByUserIdAndProductId(Long userId, Long productId);
}


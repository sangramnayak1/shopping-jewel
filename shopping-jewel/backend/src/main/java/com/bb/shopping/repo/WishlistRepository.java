package com.bb.shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bb.shopping.model.WishlistItem;

import java.util.List;

public interface WishlistRepository extends JpaRepository<WishlistItem, Long> {
  List<WishlistItem> findByUserId(Long userId);
  boolean existsByUserIdAndProductId(Long userId, Long productId);
}


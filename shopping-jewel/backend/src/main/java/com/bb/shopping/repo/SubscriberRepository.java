package com.bb.shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bb.shopping.model.Subscriber;

import java.util.Optional;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
	Optional<Subscriber> findByEmail(String email);
}


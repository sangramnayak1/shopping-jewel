package com.bb.shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bb.shopping.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
	
}

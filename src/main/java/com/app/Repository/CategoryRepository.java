package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
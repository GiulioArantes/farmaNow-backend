package com.generation.farmanow.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmanow.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    public List<Category> findAllByDepartmentContainingIgnoreCase(@Param("department") String department);
}

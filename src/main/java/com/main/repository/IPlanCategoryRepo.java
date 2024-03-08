package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.PlanCategory;

public interface IPlanCategoryRepo extends JpaRepository<PlanCategory, Integer>
{

}

package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Plan;

public interface IPlanRepo extends JpaRepository<Plan, Integer> 
{

}

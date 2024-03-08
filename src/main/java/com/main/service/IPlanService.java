package com.main.service;

import java.util.List;
import java.util.Map;

import com.main.entity.Plan;

public interface IPlanService 
{
      public boolean savePlan(Plan plan);
      public Map<Integer,String> getAllPlanCategoryData();
      public List<Plan> viewAllPalns();
      public Plan getPlanById(Integer id);
      public boolean updatePlan(Plan plan);
      public boolean deleteById(Integer id);
      public boolean softDelete(Integer planId, String status);
}

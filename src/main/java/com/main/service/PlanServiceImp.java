package com.main.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Plan;
import com.main.entity.PlanCategory;
import com.main.repository.IPlanCategoryRepo;
import com.main.repository.IPlanRepo;

@Service("planService")
public class PlanServiceImp implements IPlanService {
    
	@Autowired
	private IPlanRepo planRepo;
	@Autowired
	private IPlanCategoryRepo categoryRepo;
	
	@Override
	public boolean savePlan(Plan plan) {
		 
		Plan plan1 = planRepo.save(plan);
		//fresher
		/*if(plan1.getPlanId()!=null)
		
			return true;
		else
		return false;*/
		//return plan1.getPlanId()!=null?true:false; 1year exp
		
		return plan1.getPlanId()!=null;
	}

	@Override
	public List<Plan> viewAllPalns() {
		 
		return planRepo.findAll();
	}

	@Override
	public Map<Integer, String> getAllPlanCategoryData() {
		 
		
		  List<PlanCategory> categoryList = categoryRepo.findAll();
		  Map<Integer, String> planCategoryMap = categoryList.stream().collect(Collectors.toMap(PlanCategory::getCategoryId,PlanCategory::getCategoryName));
		   
		  System.out.println("PlanServiceImp.getAllPlanCategoryData()");
		  planCategoryMap.forEach((key, value) -> System.out.println(key + ": " + value));
		  return planCategoryMap;
	}

	@Override
	public Plan getPlanById(Integer id) {
		     Optional<Plan> findById = planRepo.findById(id);
		     if(findById.isPresent())
		     {
		    	 return findById.get();
		     }
		     
		return null;
	}

	@Override
	public boolean updatePlan(Plan plan) {
		 
		Plan plan1 = planRepo.save(plan);
		
		return plan1.getPlanId()!=null;
	}

	@Override
	public boolean deleteById(Integer id) {
		 
		boolean status = false;
		try
		{
			planRepo.deleteById(id);
			status = true;
		}
		catch (Exception e) {
			 e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean softDelete(Integer planId, String status) {
		 Optional<Plan> findById = planRepo.findById(planId);
		 if(findById.isPresent())
		 {
			 Plan plan = findById.get();
			 plan.setRecordStatus(status);
				/* PlanCategory c = categoryRepo.findById(plan.getPlanCategoryId()).get();
				 c.setRecordStatus(status);*/
			 planRepo.save(plan);
			 return true;
		 }
		return false;
	}

}

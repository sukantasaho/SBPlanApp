package com.main.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Plan;
import com.main.service.IPlanService;

@RestController
@RequestMapping("/plan-api")
public class PlanController 
{
     
	@Autowired
	private IPlanService service;
	
	@PostMapping("/savePlan")
	public ResponseEntity<Boolean> savePlan(@RequestBody Plan plan) {
		 
		boolean status = service.savePlan(plan);
		 
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
	}

	@GetMapping("/viewAllPlans")
	public ResponseEntity<List<Plan>> viewAllPalns() {
		 List<Plan> list = service.viewAllPalns();
		return new ResponseEntity<List<Plan>>(list, HttpStatus.OK);
	}

	@GetMapping("/getPlanCategoryDropdownData")
	public ResponseEntity<Map<Integer, String>> getAllPlanCategoryData() {
		 
		
		Map<Integer, String> map = service.getAllPlanCategoryData();
		  
		  return  new ResponseEntity<Map<Integer, String>>(map, HttpStatus.OK);
	}
    
	@GetMapping("/getSinglePlan")
	public ResponseEntity<Plan> getPlanById(@RequestParam("planId") Integer id) {
		    Plan plan = service.getPlanById(id);
		return new ResponseEntity<Plan>(plan, HttpStatus.OK);
	}

	@PutMapping("/updatePlan")
	public ResponseEntity<Boolean> updatePlan(@RequestBody Plan plan) {
		 
		boolean status = service.updatePlan(plan);
		
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
	}
 
	@DeleteMapping("/deletePlan")
	public ResponseEntity<Boolean> deleteById(@RequestParam("planId") Integer id) {
		 
		boolean status = service.deleteById(id);
		 
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
	}

	@DeleteMapping("/softDeletePlan")
	public  ResponseEntity<Boolean> softDelete(@RequestParam("planId") Integer planId, @RequestParam("status") String status) {
		 boolean status1 = service.softDelete(planId, status);
		 return new ResponseEntity<Boolean>(status1, HttpStatus.OK);
	}
}

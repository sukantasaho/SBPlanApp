package com.main.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PLAN_MASTER")
public class Plan
{
	  @Id
	  @GeneratedValue
	  @Column(name="PLAN_ID")
      private Integer planId;
	 
	  @Column(name="PLAN_NAME")
      private String planName;
	 
	  @Column(name="PLAN_START_DATE")
	  private LocalDate planStartDate;
	 
	  @Column(name="PLAN_END_DATE")
	  private LocalDate planEndDate;
      
	  @Column(name="PLAN_CATEGORY_ID")
	  private Integer planCategoryId;
	
      @Column(name="RECORD_STATUS")
  	  private String recordStatus = "A";
  	
  	  @Column(name="CREATED_BY")
  	  private String createdBy;
  	
  	  @Column(name="UPDATED_BY")
  	  private String updatedBy;
  	
  	  @Column(name="CREATED_DATE", updatable = false)
  	  @CreationTimestamp
  	  private LocalDate createdDate;
  	
  	  @Column(name="UPDATED_DATE", insertable = false)
  	  @UpdateTimestamp
  	  private LocalDate updatedDate;

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public LocalDate getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}

	public LocalDate getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}

	public Integer getPlanCategoryId() {
		return planCategoryId;
	}

	public void setPlanCategoryId(Integer planCategoryId) {
		this.planCategoryId = planCategoryId;
	}

	public String getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
  	  
  	  
      
}

package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.service.IPlanService;

@SpringBootApplication
public class SbPlanAppApplication {

	public static void main(String[] args) {
	     SpringApplication.run(SbPlanAppApplication.class, args);
		/*IPlanService service = ctx.getBean("planService", IPlanService.class);
		service.getAllPlanCategoryData();
		
		((ConfigurableApplicationContext) ctx).close();*/
	}

}

package com.Demo.spring.concept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Demo.spring.concept.component.DemoBean;
import com.Demo.spring.concept.component.EmployeeBean;

@SpringBootApplication
public class SpringConceptApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptApplication.class);
	
	public static void main(String[] args) {
		logger.debug("Welcome to Spring concept");
		ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean ="+demoBean.toString());
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}

}
 
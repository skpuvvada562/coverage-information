package com.learn.microservices.coverageinformation.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learn.microservices.coverageinformation.model.CoverageComponent;
import com.learn.microservices.coverageinformation.model.EnrollmentCoverage;


@RestController
@RequestMapping("/resources")
public class CoverageResource {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${component.url}")
	private String url;
	
	@RequestMapping("/getCoverage")
	public EnrollmentCoverage getCoverage(){
		
		CoverageComponent cc= restTemplate.getForObject(url, CoverageComponent.class);
		EnrollmentCoverage ec=new EnrollmentCoverage(1,"New hire",cc);
		return ec;
		
	}
	
}


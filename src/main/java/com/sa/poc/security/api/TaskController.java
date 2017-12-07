package com.sa.poc.security.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import java.security.Principal;


@RestController
public class TaskController {
//	@Value("${okta.oauth.clientId}")

	//@PathVariable("id") long id
	// Get Task by id
	@RequestMapping("/task/{id}")
    @PreAuthorize("hasAuthority('Everyone') || #oauth2.hasScope('email')")
//	public Task getTaskById(@PathVariable("id") long id, Principal principal, Authentication authentication) {
	public Task getTaskById(@PathVariable("id") long id, Principal principal) {
		
		Task task = new Task(id, 
							"Tasks for today:" + principal.getName(), // name 
							"This is just demo POC task", 
							"XYZ", // project code 
							"POC"); // category
		return task;
	}

}

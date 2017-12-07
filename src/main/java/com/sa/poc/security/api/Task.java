package com.sa.poc.security.api;

public class Task  {

    private final long id;
    private final String name;
    private final String description;
    private final String projectCode;
    private final String category;
    
    
	public Task(long id, String name, String description, String projectCode, String category) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.projectCode = projectCode;
		this.category = category;
		
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public String getCategory() {
		return category;
	}

}

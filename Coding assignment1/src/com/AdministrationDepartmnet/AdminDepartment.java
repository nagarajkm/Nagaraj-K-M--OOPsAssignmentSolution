package com.AdministrationDepartmnet;

import com.SuperClass.department.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
		
	public String departmentName() {
		
		System.out.println("Welcome to Admin Department");
		return "Admin Department  ";
	}
	public String getTodaysWork() {
	    System.out.println("Complete your documents submission");
		return "Complete your documents Submission";
		
	}
	public String getWorkDeadline() {
		System.out.println("Complete by EOD");
		return "Complete by EOD";
		
	}
}

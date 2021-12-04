package com.HrDepartment;

import com.SuperClass.department.SuperDepartment;

public class HrDepartment extends SuperDepartment  {
	
public String departmentName() {
		
		System.out.println("Welcome to HR Department");
           return "departmentName";
	}
	public String getTodaysWork() {
		System.out.println("Fill today’s timesheet and mark your attendance");
		 return "getTodaysWork";
		
	}
	public String getWorkDeadline() {
		System.out.println("Complete by EOD");
		return "getWorkDeadline";
	}
	public String doActivity() {
		System.out.println("Team Lunch");
		return "doActivitye";
		
	}
}



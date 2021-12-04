package com.TechDepartment;

import com.SuperClass.department.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	public String departmentName() {
		
		System.out.println("Welcome to Tech Department");
		return "departmentName";
		}
		public String getTodaysWork() {
			System.out.println("Complete coding of Module 1");
			return "getTodaysWork";
			
		}
		public String getWorkDeadline() {
			System.out.println("Complete by EOD");
			return "getWorkDeadline";
			
		}
		public String getTechStackInformation() {
			System.out.println("Core Java");
			return "getTechStackInformation";
			
		}
}

package com.DriverClassMain;

import com.AdministrationDepartmnet.AdminDepartment;
import com.HrDepartment.HrDepartment;
import com.SuperClass.department.SuperDepartment;
import com.TechDepartment.TechDepartment;

public class Main {

	public static void main(String[] args) {
	
		SuperDepartment adminDepartment=new AdminDepartment();
		adminDepartment.departmentName();
		adminDepartment.getTodaysWork();
		adminDepartment.getWorkDeadline();
		adminDepartment.isTodayAHoliday();
		System.out.println("");
		
		HrDepartment hrDepartment=new HrDepartment();
		hrDepartment.departmentName();
		hrDepartment.doActivity();
		hrDepartment.getTodaysWork();
		hrDepartment.getWorkDeadline();
		hrDepartment.isTodayAHoliday();
		System.out.println("");
	
		TechDepartment techDepartment=new TechDepartment();
		techDepartment.departmentName();
		techDepartment.getTodaysWork();
		techDepartment.getWorkDeadline();
		techDepartment.getTechStackInformation();
		techDepartment.isTodayAHoliday();
	}

}

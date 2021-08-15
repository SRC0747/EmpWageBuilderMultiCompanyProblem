package com.employeewagemulticompany;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem.");
        int IS_FULL_TIME=2;
        int IS_PART_TIME=1;
        int EMP_RATE_PER_HOUR=20;
        int empHrs=0;
        int empWage=0;
        double empCheck = Math.floor(Math.random()*10)%3;
        if (empCheck == IS_PART_TIME) {
            System.out.println("Employee is Part-time Present.");
            empHrs=4;
        }
        else if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Full-time Present.");
            empHrs=8;
        }
        else {
            System.out.println("Employee is Absent.");
            empHrs=0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage is:"+empWage);
    }
}

package com.employeewagemulticompany;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem.");
        int IS_FULL_TIME=2;
        int IS_PART_TIME=1;
        int EMP_RATE_PER_HOUR=20;
        int empHrs=0;
        int empWage=0;
        int empCheck = (int) Math.floor(Math.random()*10)%3;
        switch (empCheck){
            case 2:
                empHrs=8;
                break;
            case 1:
                empHrs=4;
                break;
            default:
                empHrs=0;
                break;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage is:"+empWage);
    }
}

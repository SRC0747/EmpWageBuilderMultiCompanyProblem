package com.employeewagemulticompany;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem.");
        int IS_FULL_TIME=2;
        int IS_PART_TIME=1;
        int EMP_RATE_PER_HOUR=20;
        int day=1;
        int empHrs=0;
        int empWage=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;
        int workingDays=2;
        int MAX_HRS_IN_MONTH=10;
        while (totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<workingDays) {
            totalWorkingDays++;
            int empCheck=(int) Math.floor(Math.random()*10)%3;
            switch (empCheck) {
                case 2:
                    System.out.println("Employee Full-time Present.");
                    empHrs = 8;
                    break;
                case 1:
                    System.out.println("Employee Part-time Present.");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent.");
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("DAy:"+totalWorkingDays+"Employee Hours:"+empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage is:"+totalEmpWage);
    }
}

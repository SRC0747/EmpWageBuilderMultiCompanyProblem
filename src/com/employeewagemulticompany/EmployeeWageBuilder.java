package com.employeewagemulticompany;
public interface IComputeEmpWage{
    private void addEmployeeWageBuilder(String company,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth);
    public void computeEmpWage();
    public int getTotalWage(String company);
}
public class EmployeeWageBuilder {
    public final String company;
   public final int empRatePerHour;
   public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;

    public EmployeeWageBuilder(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }
    public String toString(){
        return "Total employee wage for company:"+company+"is:"+totalEmpWage;
    }

    public class EmpWageBuilderArray{
        public static final int IS_FULL_TIME=2;
        public static final int IS_PART_TIME=1;
        private int numOfCompany = 0;
        private CompanyEmpWage[] companyEmpWageArray;

        public EmpWageBuilderArray() {
            companyEmpWageArray = new companyEmpWageArray[5];
        }
        private void addEmployeeWageBuilder(String company,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth)
        {
            companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
            numOfCompany++;
            EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);

        }
    }

    public void computeEmpWage(){
        for (int i=0; i<numOfCompany; i++)
        {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    public int computeEmpWage(EmployeeWageBuilder employeeWageBuilder){
        int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
        while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
        {
            totalWorkingDays++;
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
            totalEmpHrs+=empHrs;
            System.out.println("Days:"+totalWorkingDays+"Emp Hour:"+empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
        return totalEmpWage;
    }
    public int getTotalWage(String company)
    {
        return companyToEmpWageMap.get(company).totalEmpWage;
    }

    public static void main(String[] args)
    {
        IComputeEmpWage empWageBuilder = new EmpWageBuilder();
        //EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
        empWageBuilder.addEmployeeWageBuilder("DMart",20,2,10);
        empWageBuilder.addEmployeeWageBuilder("Reliance",10,4,20);
        empWageBuilder.computeEmpWage();
    }
}

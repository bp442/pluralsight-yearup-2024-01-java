package com.pluralsight;

public class Employee
{
    private String employeeId, name, department;
    private double payRate;
    private int hoursWorked;

    public Employee(String inputId, String inputName, String inputDepartment, double inputPayRate, int inputHoursWorked){
        employeeId = inputId;
        name = inputName;
        department = inputDepartment;
        payRate = inputPayRate;
        hoursWorked = inputHoursWorked;
    }

    public double getTotalPay(){
        return payRate * hoursWorked;
    }

    public int getRegularHours(){
        if(hoursWorked > 40){
            return 40;
        }
        else{
            return hoursWorked;
        }
    }

    public int getOvertimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }
        else{
            return 0;
        }
    }
}

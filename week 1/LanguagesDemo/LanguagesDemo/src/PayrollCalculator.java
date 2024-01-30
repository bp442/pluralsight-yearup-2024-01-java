import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        String userName;
        float hoursWorked, payRate, grossPay, overtimeHours;

        System.out.println("Enter the employee's name: ");
        userName = userInput.nextLine();

        System.out.println("Enter their hours worked: ");
        hoursWorked = Float.parseFloat(userInput.nextLine());

        System.out.println("Enter their pay rate: ");
        payRate = Float.parseFloat(userInput.nextLine());

        if(hoursWorked > 40){
            overtimeHours = hoursWorked - 40;
            hoursWorked -= overtimeHours;

            grossPay = (hoursWorked * payRate) + (overtimeHours * (payRate * 1.5f));
        }
        else {
            grossPay = hoursWorked * payRate;
        }
        System.out.println("Employee: " + userName);
        System.out.println("Gross Pay: $" + grossPay);
    }
}

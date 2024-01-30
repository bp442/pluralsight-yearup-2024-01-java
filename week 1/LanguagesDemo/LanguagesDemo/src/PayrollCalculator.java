import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        String userName;
        float hoursWorked, payRate, grossPay;

        System.out.println("Enter the employee's name: ");
        userName = userInput.nextLine();

        System.out.println("Enter their hours worked: ");
        hoursWorked = Float.parseFloat(userInput.nextLine());

        System.out.println("Enter their pay rate: ");
        payRate = Float.parseFloat(userInput.nextLine());

        grossPay = hoursWorked * payRate;

        System.out.println("Employee: " + userName);
        System.out.println("Gross Pay: $" + grossPay);
    }
}

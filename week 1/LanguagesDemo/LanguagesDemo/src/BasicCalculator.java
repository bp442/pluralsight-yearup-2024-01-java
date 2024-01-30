import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        double firstNum, secondNum;
        String operationType, operator = "";
        boolean calculate = true;
        double solution = 0;

        System.out.println("Enter the first number: ");
        firstNum = Integer.parseInt(userInput.nextLine());

        System.out.println("Enter the second number: ");
        secondNum = Integer.parseInt(userInput.nextLine());

        System.out.println("Possible Calculations: ");
        System.out.println(" (A)dd");
        System.out.println(" (S)ubtract");
        System.out.println(" (M)ultiply");
        System.out.println(" (D)ivide");
        System.out.println("Please select an option: " );
        operationType = userInput.nextLine();

        if(operationType.equalsIgnoreCase("a")){
            solution = firstNum + secondNum;
            operator = "+";
        }
        else if(operationType.equalsIgnoreCase("s")){
            solution = firstNum - secondNum;
            operator = "-";
        }
        else if(operationType.equalsIgnoreCase("m")){
            solution = firstNum * secondNum;
            operator = "*";
        }
        else if(operationType.equalsIgnoreCase("d")){
            solution = firstNum / secondNum;
            operator = "/";
        }
        else{
            System.out.println("Not a calculation");
            calculate = false;
        }

        if(calculate){
            System.out.println(firstNum + " " + operator + " " + secondNum + " = " + solution);
        }

    }
}

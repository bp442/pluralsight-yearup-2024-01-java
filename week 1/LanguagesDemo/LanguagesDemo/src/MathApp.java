import java.sql.SQLOutput;

public class MathApp {
    public static void main(String[] args){
        //Declare variables here
        //then code solution
        //then use System.out.println() to display results
        //REPEAT FOR EACH EXERCISE
        //Question 1:
        float bobSalary = 44.50f;
        float garySalary = 50.75f;
        float highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("Question 1:");
        System.out.println("The highest salary is $" + highestSalary);

        //Question 2:
        float carPrice = 8500f;
        float truckPrice = 9800f;

        System.out.println("Question 2:");
        System.out.println(Math.min(carPrice, truckPrice));

        //Question 3:
        double radius = 7.25;
        double area = (Math.PI * Math.pow(radius, 2));
        System.out.println("Question 3:");
        System.out.println("The area of the circle is " + area);

        //Question 4:
        double tempNum = 5.0;
        double sqrtNum = Math.sqrt(tempNum);

        System.out.println("Question 4:");
        System.out.println("The square root of 5 is " + sqrtNum);

        //Question 5:
        int x1 = 5, x2 = 85, y1 = 10, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));

        System.out.println("The distance between (5,10) and (85,50) is: " + distance + " units");

        //Question 6:
        double initialValue = -3.8;
        double absValue = Math.abs(initialValue);

        System.out.println("The absolute value of -3.8 is " + absValue);

        //Question 7:
        double randomNum = Math.random();

        System.out.println("A random number in between 0 and 1 is: " + randomNum);


    }
}

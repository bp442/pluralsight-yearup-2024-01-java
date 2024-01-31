import java.util.Scanner;

public class FullNameGenerator {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        String first, last, middle = "", suffix = "", fullName;

        System.out.println("Please enter your name.");
        System.out.println("Enter your first name: ");
        first = userInput.nextLine().trim();

        System.out.println("Enter your middle name: ");
        middle = userInput.nextLine().trim();

        System.out.println("Enter your last name: ");
        last = userInput.nextLine().trim();

        System.out.println("Enter your suffix: ");
        suffix = userInput.nextLine().trim();

        if(middle.equalsIgnoreCase("")){
            fullName = first + " " + last;
        }
        else{
            fullName = first + " " + middle + " " + last;
        }

        if(!suffix.equalsIgnoreCase("")){
            fullName += ", " + suffix;
        }

        System.out.println("Full Name: " + fullName);
    }
}

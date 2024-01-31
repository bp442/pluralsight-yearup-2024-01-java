import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String fullName = userInput.nextLine().trim();

        String first, middle, last;

        if(fullName.indexOf(" ") == fullName.lastIndexOf(" ")){
        first = fullName.substring(0, fullName.indexOf(" "));
        middle = "(none)";
        last = fullName.substring(fullName.indexOf(" ") + 1);
        }
        else{
            first = fullName.substring(0, fullName.indexOf(" "));
            middle = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
            last = fullName.substring(fullName.lastIndexOf(" ") + 1);
        }

        System.out.println("First name: " + first);
        System.out.println("Middle name: " + middle);
        System.out.println("Last name: " + last);

    }
}

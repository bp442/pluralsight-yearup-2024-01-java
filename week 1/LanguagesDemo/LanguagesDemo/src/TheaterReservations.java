import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        String inputName, fullName, showDate;
        int numTickets;

        System.out.println("Please enter your name: ");
        inputName = userInput.nextLine().trim();

        fullName = inputName.substring(inputName.indexOf(" "));
        fullName += ", " + inputName.substring(0, inputName.indexOf(" "));

        System.out.println("What date will you be coming (MM/DD/YYYY): ");
        showDate = userInput.nextLine().trim();

        System.out.println("How many tickets would you like to buy?");
        numTickets = Integer.parseInt(userInput.nextLine().trim());

        if(numTickets == 1){
            System.out.println(numTickets + " ticket reserved for " + showDate + " under" + fullName);
        }
        else{
            System.out.println(numTickets + " tickets reserved for " + showDate + " under" + fullName);
        }
    }
}

import java.util.Scanner;

public class RentalCarCalculator {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        String pickupDate, tollTagBool, gpsBool, roadsideBool;
        int numDays, currentAge;
        double basicPrice = 29.99, tollTagDailyCost = 3.95, gpsDailyCost = 2.95, roadsideDailyCost = 3.95, underageSurcharge = 0, totalCost;
        boolean isUnderage = false;

        System.out.println("When will you pick up the car?");
        pickupDate = userInput.nextLine();

        System.out.println("How many days will you rent the car?");
        numDays = Integer.parseInt(userInput.nextLine());

        System.out.println("Do you want an electronic toll tag at $3.95/day? (Y/N)");
        tollTagBool = userInput.nextLine();

        System.out.println("Do you want a GPS at $2.95/day? (Y/N)");
        gpsBool = userInput.nextLine();

        System.out.println("Do you want roadside assistance at $3.95/day? (Y/N)");
        roadsideBool = userInput.nextLine();

        System.out.println("What is your current age?");
        currentAge = Integer.parseInt(userInput.nextLine());


        System.out.println("Cost of Everything Selected: " );

        totalCost = basicPrice * numDays;
        System.out.println("Basic Car Rental : $" + totalCost);
        if(currentAge < 25){
            isUnderage = true;
            underageSurcharge = totalCost * 0.3;
            underageSurcharge = Math.round(underageSurcharge * 100.0)/100.0;
        }


        if(tollTagBool.equalsIgnoreCase("y")){
            System.out.println("Electronic Toll Tag : $" + (numDays * tollTagDailyCost));
            totalCost += (numDays * tollTagDailyCost);
        }
        if(gpsBool.equalsIgnoreCase("y")){
            System.out.println("GPS : $" + (numDays * gpsDailyCost));
            totalCost += (numDays * gpsDailyCost);
        }
        if(roadsideBool.equalsIgnoreCase("y")){
            System.out.println("Roadside Assistance : $" + (numDays * roadsideDailyCost));
            totalCost += (numDays * roadsideDailyCost);
        }


        if(isUnderage){
            System.out.println("Underage Driver Surcharge : $" + underageSurcharge);
            totalCost += underageSurcharge;
        }

        totalCost = Math.round(totalCost * 100.0) / 100.0;
        System.out.println("Total Cost: $" + totalCost);



    }
}

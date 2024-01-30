import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int size, age;
        double baseCost, finalCost;
        System.out.println("What size sandwich would you like?");
        System.out.println("- 1. Regular: base price $5.45");
        System.out.println("- 2. Large: base price $8.95");
        size = Integer.parseInt(userInput.nextLine());

        System.out.println("What age are you? The following ages get discounts: ");
        System.out.println("- Student (17 years old or younger) : 10% Discount");
        System.out.println("- Seniors (65 years old or older) : 20% Discount");
        age = Integer.parseInt(userInput.nextLine());

        if(size == 1){
            baseCost = 5.45;
        }
        else{
            baseCost = 8.95;
        }

        if(age <= 17){
            finalCost = baseCost * 0.9;
        }
        else if(age >= 65){
            finalCost = baseCost * 0.8;
        }
        else{
            finalCost = baseCost;
        }

        finalCost = Math.round(finalCost * 100.0)/100.0;

        System.out.println("The final cost of your sandwich is: $" + finalCost);
    }
}

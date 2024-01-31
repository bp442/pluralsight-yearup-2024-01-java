import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String fullName, billingStreet, shippingStreet;
        StringBuilder billingCity = new StringBuilder("");
        StringBuilder shippingCity = new StringBuilder("");

        System.out.println("Please provide the following information: ");
        System.out.println("Full name: ");
        fullName = userInput.nextLine();

        System.out.println("Billing Street: " );
        billingStreet = userInput.nextLine();

        System.out.println("Billing City: ");
        billingCity.append(userInput.nextLine().trim() + ", ");

        System.out.println("Billing State: ");
        billingCity.append(userInput.nextLine() + " ");

        System.out.println("Billing Zip: ");
        billingCity.append(userInput.nextLine());

        System.out.println("Shipping Street: " );
        shippingStreet = userInput.nextLine();

        System.out.println("Shipping City: ");
        shippingCity.append(userInput.nextLine().trim() + ", ");

        System.out.println("Shipping State: ");
        shippingCity.append(userInput.nextLine() + " ");

        System.out.println("Shipping Zip: ");
        shippingCity.append(userInput.nextLine());



        System.out.println("Customer Information: ");
        System.out.println(fullName + "\n");
        System.out.println("Billing Address: " );
        System.out.println(billingStreet);
        System.out.println(billingCity + "\n");

        System.out.println("Shipping Address: " );
        System.out.println(shippingStreet);
        System.out.println(shippingCity);
    }
}

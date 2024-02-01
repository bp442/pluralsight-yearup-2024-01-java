import java.util.Scanner;

public class CellPhoneService {

    public static class CellPhone {
        int serialNumber;
        String model, carrier, phoneNumber, owner;

        public CellPhone() {
            int serialNumber = 0;
            String model = "", carrier = "", phoneNumber = "", owner = "";

        }

        public void setSerialNumber(int inputSerialNumber) {
            serialNumber = inputSerialNumber;
        }
        public int getSerialNumber(){
            return serialNumber;
        }

        public void setPhoneModel(String inputModel) {
            model = inputModel;
        }
        public String getPhoneModel(){
            return model;
        }

        public void setCarrier(String inputCarrier) {
            carrier = inputCarrier;
        }
        public String getCarrier(){
            return carrier;
        }

        public void setPhoneNumber(String inputNumber) {
            phoneNumber = inputNumber;
        }
        public String getPhoneNumber(){
            return phoneNumber;
        }

        public void setOwner(String inputOwner) {
            owner = inputOwner;
        }
        public String getOwner(){
            return owner;
        }



    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        CellPhone userCell = new CellPhone();

        System.out.println("What is the serial number?");
        userCell.setSerialNumber(Integer.parseInt(userInput.nextLine()));

        System.out.println("What is the phone model?");
        userCell.setPhoneModel(userInput.nextLine());

        System.out.println("What is the phone carrier?");
        userCell.setCarrier(userInput.nextLine());

        System.out.println("What is the phone number?");
        userCell.setPhoneNumber(userInput.nextLine());

        System.out.println("Who is the owner?");
        userCell.setOwner(userInput.nextLine());

        System.out.println("Customer's Phone Details");
        System.out.println("Serial Number: " + userCell.serialNumber);
        System.out.println("Phone Model: " + userCell.model);
        System.out.println("Phone Carrier: " + userCell.carrier);
        System.out.println("Phone Number: " + userCell.phoneNumber);
        System.out.println("Owner: " + userCell.owner);



    }

}


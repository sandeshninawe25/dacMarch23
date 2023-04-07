package problem5;
import java.util.Scanner;


public class TelephoneBill {
    private String customerName;
    private String phoneNumber;
    private int numberOfCalls;
    private int totalDuration;
    private double bill;
    private Scanner scanner;

    public TelephoneBill() {
        scanner = new Scanner(System.in);
    }

    public void getCustomerInfo() {
        System.out.print("Enter customer name: ");
        customerName = scanner.nextLine();

        System.out.print("Enter phone number: ");
        phoneNumber = scanner.nextLine();

        System.out.print("Enter number of calls made: ");
        numberOfCalls = scanner.nextInt();

        System.out.print("Enter total duration of calls (in minutes): ");
        totalDuration = scanner.nextInt();
    }

    public void calculateBill() {
        // Calculate bill
        bill = 10.0; // flat rate of $10 per month
        int remainingCalls = numberOfCalls - 100;
        if (remainingCalls > 0) {
            bill = bill+ 50.0; // first 100 calls charged at 50 cents per call
            bill = bill+ remainingCalls * 25.0; // calls beyond the first 100 are charged at 25 cents per call
        } else {
            bill = bill+  numberOfCalls * 50.0;
        }

        int totalDurationRoundedUp = (int) Math.ceil(totalDuration / 60.0); // duration rounded up to nearest minute
        bill += totalDurationRoundedUp * 0.5; // all calls are subject to a minimum duration of 1 minute and charged at 50 cents per minute
    }

    public void printBill() {
        // Print bill for the customer
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Number of Calls: " + numberOfCalls);
        System.out.println("Duration of Calls: " + totalDuration + " minutes");
        System.out.println("Total Bill: $" + bill);
    }

    public static void main(String[] args) {
        TelephoneBill calculator = new TelephoneBill();
        calculator.getCustomerInfo();
        calculator.calculateBill();
        calculator.printBill();
    }
}

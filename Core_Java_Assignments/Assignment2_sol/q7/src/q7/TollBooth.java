package q7;

import java.util.Scanner;

public class TollBooth {

    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;

    public static void main(String[] args) {
        TollBooth tollBooth = new TollBooth();
        tollBooth.showMenu();
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Enter vehicle type (car, van, bus, or truck):");
            vehicleType = scanner.nextLine();

            System.out.println("Enter number of axles:");
            numAxles = scanner.nextInt();

            System.out.println("Enter distance traveled:");
            distanceTraveled = scanner.nextDouble();

            System.out.println("Choose an option:");
            System.out.println("1. Calculate toll fee");
            System.out.println("2. Generate bill");
            System.out.println("3. Exit");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    calculateTollFee();
                    System.out.println("Toll fee for this vehicle: $" + tollFee);
                    break;
                case 2:
                    generateBill();
                    System.out.println("Bill generated for this vehicle:");
                    System.out.println("Vehicle Type: " + vehicleType);
                    System.out.println("Number of axles: " + numAxles);
                    System.out.println("Distance traveled: " + distanceTraveled + " miles");
                    System.out.println("Toll fee: $" + tollFee);
                    System.out.println("Processing fee: $2.00");
                    System.out.println("Total amount due: $" + totalAmountDue);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }

    private void calculateTollFee() {
        if (vehicleType.equalsIgnoreCase("car") || vehicleType.equalsIgnoreCase("van") || vehicleType.equalsIgnoreCase("bus")) {
            tollFee = 0.25 * numAxles * distanceTraveled;
        } else if (vehicleType.equalsIgnoreCase("truck")) {
            tollFee = 0.50 * numAxles * distanceTraveled;
        } else {
            System.out.println("Invalid vehicle type.");
        }
    }

    private void generateBill() {
        totalAmountDue = tollFee + 2.00;
    }
}



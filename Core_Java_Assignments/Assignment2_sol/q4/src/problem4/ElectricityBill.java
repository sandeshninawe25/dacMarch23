package problem4;

import java.util.Scanner;

public class ElectricityBill {

	private String customerName;
	private	Double unitsConsumed;
	private Double billAmount;
	
	
	public ElectricityBill(String customerName, Double unitsConsumed) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");

		this.customerName = sc.nextLine();
		System.out.println("Units consumed : ");
		this.unitsConsumed = sc.nextDouble();
		}
	private void calculateBillAmount() {
		if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 5 + (unitsConsumed - 100) * 7;
        } else {
            billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10;
        }
		
	}
	
	  public void displayBill() {
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Units Consumed: " + unitsConsumed);
	        System.out.println("Bill Amount: Rs." + billAmount);
	    }
	public static void main(String[] args) {
		ElectricityBill	b = new ElectricityBill(null, null);
		b.calculateBillAmount();
	    b.displayBill();
	}

}

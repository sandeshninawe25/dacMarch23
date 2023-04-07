package q2;
import java.util.Scanner;
public class BMI {
	
	    private double height;
	    private double weight;
	    
	    public BMI(double height, double weight) {
	        this.height = height;
	        this.weight = weight;
	    }
	    
	    public double getHeight() {
	        return height;
	    }
	    
	    public void setHeight(double height) {
	        this.height = height;
	    }
	    
	    public double getWeight() {
	        return weight;
	    }
	    
	    public void setWeight(double weight) {
			this.weight = weight;
		}

		public double calculateBMI() {
	        return weight / (height * height);
	    }
  
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your height in meters: ");
	        double height = scanner.nextDouble();
	        
	        System.out.print("Enter your weight in kilograms: ");
	        double weight = scanner.nextDouble();
	        
	        BMI calculator = new BMI(height, weight);
	        double bmi = calculator.calculateBMI();
	        
	        System.out.println("Your BMI is " + bmi);
	        
	    }
	}
	
	


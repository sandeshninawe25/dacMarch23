import java.util.Scanner;

class paircode4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in meters: ");
        double distance = sc.nextDouble();

        System.out.print("Enter the time taken (hours): ");
        int hours = sc.nextInt();

        System.out.print("Enter the time taken (minutes): ");
        int minutes = sc.nextInt();

        System.out.print("Enter the time taken (seconds): ");
        int seconds = sc.nextInt();

        
        double TimeInSec = hours * 3600 + minutes * 60 + seconds;
        double speedInMetersPerSec = distance / TimeInSec;
        double speedInKilometersPerHour = (distance / 1000) / (TimeInSec / 3600);
        double speedInMilesPerHour = (distance / 1609) / (TimeInSec / 3600);

        System.out.println("Speed in meters/second: " + speedInMetersPerSec);
        System.out.println("Speed in kilometers/hour: " + speedInKilometersPerHour);
        System.out.println("Speed in miles/hour: " + speedInMilesPerHour);
    }
}
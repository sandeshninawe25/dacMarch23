import java.util.Scanner;
class paircode1 {

    public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = sc.nextInt();
       
       
        int sum= 0 ;
        while (num> 0)
        {   
            sum =sum + (num % 10);
            num =num/ 10;

        }
       
        System.out.println("The sum of all digit is" + sum);

    }
}
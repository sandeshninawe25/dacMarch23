 class paircode3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = sc.nextLong();

      
        long years = minutes / (60 * 24 * 365);
        long remainingMinutes = minutes % (60 * 24 * 365);
        long days = remainingMinutes / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
    class problem28{
    public static void main(String args[])
    {
    
        double d=10.3d;
        String shd= Double.toString(d);
        System.out.println(" Double value into String  " + shd);

        double d3=20.4d;
        Double d1 = new Double(d3);
        System.out.println(" double value into Long instance.  " + d1);

        String d5="10";
        Double d12 = new Double(d5);
        System.out.println(" String value into Double instance.  " + d12);

        double num = 100.56d;
        String binary = Long.toBinaryString(Double.doubleToRawLongBits(num));
        System.out.println("Binary of " + num + " is " + binary);

        String octal = Long.toOctalString(Double.doubleToLongBits(num));
        System.out.println("Octal of " + num + " is " + octal);

        String hex = Double.toHexString(num);
        System.out.println("Octal of " + num + " is " + hex);
    }
}
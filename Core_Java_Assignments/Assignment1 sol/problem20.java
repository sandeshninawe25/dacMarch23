class problem20_24_28{
    public static void main(String args[])
    {


        long a=10.4546;
        String sh1= Long.toString(a);
        System.out.println(" long value into String  " + sh1);

        long b3=10.2345345;
        Long c = new Long(b3);
        System.out.println(" Long value into Long instance.  " + c);

        String b4="10";
        Long c12 = new Long(b4);
        System.out.println(" String value into Long instance.  " + c12);

        long num = 100.435235;
        String binary = Long.toBinaryString(num);
        System.out.println("Binary of " + num + " is " + binary);

        String octal = Long.toOctalString(num);
        System.out.println("Octal of " + num + " is " + octal);

        String hex = Long.toHexString(num);
        System.out.println("Octal of " + num + " is " + hex);


    


    }


}
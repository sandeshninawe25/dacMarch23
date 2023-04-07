class problem29{
    public static void main(String args[])
    {

    double a= 10.23d;
    Double b= new Double(a);

    
     // convert Double to byte
      Byte by = b.byteValue();
      System.out.println("Float as byte: " + by);
      
      // convert Double to short
      short s = b.shortValue();
      System.out.println("Float as short: " + s);
      
      // convert Double to integer
      int i = b.intValue();
      System.out.println("Float as integer: " + i);
      
      // convert Double to Long
      long l = b.longValue();
      System.out.println("Float as Long: " + l);
      
      // convert Double to Float
      float f = b.floatValue();
      System.out.println("Float as Float: " + f);
      
      // convert Double to Double
      double d = b.doubleValue();
      System.out.println("Float as Double: " + d);




    }


}
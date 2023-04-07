class problem25{
    public static void main(String args[])
    {

    float a= 10.23f;
    Float b= new Float(a);

    
     // convert FLoat to byte
      Byte by = b.byteValue();
      System.out.println("Float as byte: " + by);
      
      // convert Float to short
      short s = b.shortValue();
      System.out.println("Float as short: " + s);
      
      // convert Integer to integer
      int i = b.intValue();
      System.out.println("Float as integer: " + i);
      
      // convert Integer to Long
      long l = b.longValue();
      System.out.println("Float as Long: " + l);
      
      // convert Integer to Float
      float f = b.floatValue();
      System.out.println("Float as Float: " + f);
      
      // convert Integer to Double
      double d = b.doubleValue();
      System.out.println("Float as Double: " + d);




    }


}
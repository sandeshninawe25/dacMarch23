class problem17 {
   public static void main(String[] args) {
      int b1 = 30;
      Integer b= new Integer(b1);
      
      // convert Integer to byte
      byte by = b.byteValue();
      System.out.println("Integer as byte: " + by);
      
      // convert Integer to short
      short s = b.shortValue();
      System.out.println("Integer as short: " + s);
      
      // convert Integer to integer
      int i = b.intValue();
      System.out.println("Integer as integer: " + i);
      
      // convert Integer to Long
      long l = b.longValue();
      System.out.println("Integer as Long: " + l);
      
      // convert Integer to Float
      float f = b.floatValue();
      System.out.println("Integer as Float: " + f);
      
      // convert Integer to Double
      double d = b.doubleValue();
      System.out.println("Integer as Double: " + d);
   }
}
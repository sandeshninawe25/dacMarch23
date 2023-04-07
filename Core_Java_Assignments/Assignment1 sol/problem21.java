class problem21 {
   public static void main(String[] args) {
      long b1 = 304654;
      Long b= new Long(b1);
      
      // convert Long to byte
      byte by = b.byteValue();
      System.out.println("Long as byte: " + by);
      
      // convert Long to short
      short s = b.shortValue();
      System.out.println("Long as short: " + s);
      
      // convert Long to int
      int i = b.intValue();
      System.out.println("Long as int: " + i);
      
      // convert Long to Long
      long l = b.longValue();
      System.out.println("Long as Long: " + l);
      
      // convert Long to Float
      float f = b.floatValue();
      System.out.println("Long as Float: " + f);
      
      // convert Long to Double
      double d = b.doubleValue();
      System.out.println("Long as Double: " + d);
   }
}
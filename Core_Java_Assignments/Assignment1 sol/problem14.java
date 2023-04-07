class problem14 {
   public static void main(String[] args) {
      short b1 = 10;
      Short b= new Short(b1);
      
      // convert Short to byte
      byte by = b.byteValue();
      System.out.println("Short as byte: " + by);
      
      // convert Short to short
      short s = b.shortValue();
      System.out.println("Short as short: " + s);
      
      // convert Short to int
      int i = b.intValue();
      System.out.println("Short as int: " + i);
      
      // convert Short to long
      long l = b.longValue();
      System.out.println("Short as long: " + l);
      
      // convert Short to float
      float f = b.floatValue();
      System.out.println("Short as float: " + f);
      
      // convert Short to double
      double d = b.doubleValue();
      System.out.println("Short as double: " + d);
   }
}
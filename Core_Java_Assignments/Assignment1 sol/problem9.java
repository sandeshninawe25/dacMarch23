class problem9 {
   public static void main(String[] args) {
      byte bs = 100;
      Byte b= new Byte(bs);
      
      // convert Byte to byte
      byte by = b.byteValue();
      System.out.println("Byte as byte: " + by);
      
      // convert Byte to short
      short s = b.shortValue();
      System.out.println("Byte as short: " + s);
      
      // convert Byte to int
      int i = b.intValue();
      System.out.println("Byte as int: " + i);
      
      // convert Byte to long
      long l = b.longValue();
      System.out.println("Byte as long: " + l);
      
      // convert Byte to float
      float f = b.floatValue();
      System.out.println("Byte as float: " + f);
      
      // convert Byte to double
      double d = b.doubleValue();
      System.out.println("Byte as double: " + d);
   }
}







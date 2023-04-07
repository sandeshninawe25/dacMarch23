class problem8{
public static void main(String args[])
{
//a. byte value into String
 byte a=127;
 String str = Byte.toString(a);
 System.out.println(str);

//b. byte value into Byte instance.
 Byte b= new Byte(a);
 System.out.println(b);

//c. String instance into Byte instance.
 String s2= "123";
 String s3 = new String (s2);
 Byte b2 = new Byte(Byte.parseByte(s3));
 System.out.println("String instance to byte instance =" + b2);

}

}
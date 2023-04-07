class problem13{
public static void main(String args[])
{
//a. short value into String
short sh= 5;
String s= Short.toString(sh) ;
System.out.println("short value into String  : " + s );

//b. short value into Short instance.
short sh2= 7;
short sh1 = new Short(sh2);
System.out.println("short value into Short instance  : " + sh1 );

//c . String instance into Short instance
String a = "123";
short sh3 = new Short(a);
System.out.println("short value into Short instance  : " + sh3 );


}


}
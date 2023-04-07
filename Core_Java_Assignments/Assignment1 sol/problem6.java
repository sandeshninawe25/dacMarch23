class problem6{
public static void main(String args[])
{

//a. boolean value into String
 boolean a1=true;
 String s = String.valueOf(a1);
 System.out.println (s);

 boolean a2=true;
 String s1 = Boolean.toString(a2);
 System.out.println (s1);
 

 //b. boolean value into Boolean instance.
 Boolean b1 = new Boolean("ABC");
 System.out.println(b1);
 
 Boolean b2 = new Boolean("true");
 System.out.println(b2);

 //c. String value into boolean value
 String s3= "1";
 Boolean b3 = Boolean.valueOf(s3);
 System.out.println (b3);

 //d. String value into Boolean instance.
 boolean a4=true;
 Boolean b4 = new Boolean(Boolean.toString(a2));
 System.out.println(b4);



}

}
 
 class problem24{
    public static void main(String args[])
    {
        float a1=10.45f;
        String sh= Float.toString(a1);
        System.out.println("float value into String  " + sh);

        float b1=50.56f;
        Float c1 = new Float(b1);
        System.out.println("float value into float instance." + c1);

        String b2="10";
        Float c2 = new Float(b2);
        System.out.println("String value into Integer instance. " + c2);
    }
 }
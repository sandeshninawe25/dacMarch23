class problem11{
    public static void main (String args[]){

            String value = args[0];
            char c = value.charAt(0);

            if (Character.isLetter(c))
               { System.out.println("The Character entered is letter");

                if (Character.isLowerCase(c))
                {
                System.out.println("The Character is Lower Case :" + c);
                System.out.println("Upper case is : "  +  Character.toUpperCase(c));
                }
                else
                {
                System.out.println("The Character is Upper Case :" + c);
                System.out.println("Lower case is : "  +  Character.toLowerCase(c));
                }
               }
            else
                System.out.println("The Character entered is digit");


    }



}
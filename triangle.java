// write a program to check if a triangle can be formed from given three angle.

public class triangle {
    public static void main(String[] args)
    {
        float a = 100, b = 40 , c = 40 , sum;
        sum = a + b + c;

        if (sum == 180 ) 
            System.out.println("The triangle can be formed.");

         else
            System.out.println("The triangle cannot be formed.");
    }
    
}

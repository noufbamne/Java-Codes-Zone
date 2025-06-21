import java.util.Scanner;
public class areacircle {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);    
    
    System.out.println("Enter the radius of the circle:  ");
    double radius = sc.nextDouble();
    
    double area = 3.14 * radius * radius;
    System.out.println("The area of circle is: " + area);
    sc.close();

    }
}

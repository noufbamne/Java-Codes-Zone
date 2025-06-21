import java.util.Scanner;
public class circumference {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);  

      System.out.println("Enetr the radius of the circle : ");
      double r = sc.nextDouble();

      double circumference = 2 * 3.14 * r;
      System.out.println("The circumference of the circle is : " + circumference);
      sc.close();

    } 
    

}

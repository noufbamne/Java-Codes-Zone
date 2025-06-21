import java.util.Scanner;
public class arearect {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length and breadth : ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double area = l * b;
        System.out.println("The area of rectangle is : " + area);
        sc.close();

    }
}

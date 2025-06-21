import java.util.Scanner;
public class areatriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base and the height : ");
        float base = sc.nextFloat();
        float height = sc.nextFloat();

        float area = (base * height)/2;
        System.out.println("The area of triangle is : " + area);
        sc.close();
    }
}

import java.util.Scanner;
public class areasquare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of the square : ");
        int side = sc.nextInt();
        
        int area = side * side;
        System.out.println("The perimeter of square is : " +  area);
        sc.close();

    }
}

import java.util.Scanner;
public class largest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a > b && a > c) {
            System.out.println("A is Greatest!");

            if (b > a && b > c) {
                System.out.println("B is Greatest!");
            }
        }
        else
        System.out.println("C is Greatest!");
        sc.close();
    }
}

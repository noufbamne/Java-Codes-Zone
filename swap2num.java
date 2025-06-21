import java.util.Scanner;
public class swap2num {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int temp;
        
        System.out.println("Before swapping : " );
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping : " + a + b);
        sc.close();
    }
        
}

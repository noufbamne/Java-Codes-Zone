import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        System.out.println("Taking inout from the user.");
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the marks of first subject : ");
        int s1 = sc.nextInt();
        System.out.println("Enter the marks of second subject : ");
        int s2 = sc.nextInt();
        System.out.println("Enter the marks of third subject : ");
        int s3 = sc.nextInt();
        System.out.println("Enter the marks of fourth subject : ");
        int s4 = sc.nextInt();
        System.out.println("Enter the marks of fifth subject : ");
        int s5 = sc.nextInt();

        float total = (s1+s2+s3+s4+s5) ;
        float per = (total/ 500)*100;
        System.out.println("The percentage is : " + per);
        sc.close();

    }
}
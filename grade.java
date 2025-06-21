import java.util.Scanner;
public class grade {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char grade;
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();

    if (marks >= 80)
    {
        grade = 'A';
    }
    else if (marks >= 60 && marks < 80)
    {
        grade = 'B';
    }
    else if (marks >= 50 && marks < 60)
    {
        grade = 'C';
    }
    else if (marks >= 45 && marks < 50)
    {
        grade = 'D';
    }
    else if (marks >= 25 && marks < 45)
    {
        grade = 'E';
    }
    else 
    {
        grade = 'F';
    }
    
    if (marks >= 25) {
         System.out.println("Congratulations!\n");
            System.out.println("Your grade is : " + grade);
    }
    if (marks < 25) {

        System.out.println("Hard luck! You're fail.");
        System.out.println("Your grade is : " + grade);
    }
   sc.close();
}
}

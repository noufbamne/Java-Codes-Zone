// write a program to print the total number of marks from given marks of five subjects also print percentage of student if the student is pass 

public class marks {
    public static void main(String[] args)
    {
        int s1 = 99, s2 = 95, s3 = 91, s4 = 85, s5 = 85;
        double total = s1 + s2 + s3 + s4 + s5; 

        System.out.println("Total marks : " + total);
        
        if (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40) 
        {
             
            System.out.println("Student is pass");  
            
           double per = ( total / 500) * 100;

            System.out.println("Percentage is : " + per);
        }
        else
        System.out.println("Student is fail.");
    }
    
}



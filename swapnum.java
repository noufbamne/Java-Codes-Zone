public class swapnum {
    public static void main(String[] args)
    {
        int a = 5, b = 8 , c;
        
        System.out.println("Before Swapping : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        c = a;
        a = b;
        b = c;
        
        System.out.println("After swapping : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

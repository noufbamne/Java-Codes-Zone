// Design a function which wil display all members from 1st argument to 2nd argument 

public class funcdisplay {
    public static void main(String[] args)
    {
        System.out.println();
        display(10,20);

        System.out.println();
        display(50,60);
    }

    static void display(int n , int m)
    {
        for (int i = n ; i <= m; i++) {
            System.out.print(i + "\t");
        }
    }
}

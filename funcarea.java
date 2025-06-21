// Design a function area which will return area of rectangle when l and b is passed

public class funcarea {
    public static void main(String[] args)
    {
        int z = area (5,7) + area (3,4) + area (6,8);

        System.out.println("Total area is : " + z);
    }
    static int area (int l , int b)
    {
        int a = l * b;
        return a;
    }
}

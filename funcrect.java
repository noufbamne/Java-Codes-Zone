class rectangle{
    int length , breadth;

    void area()
    {
        int a = length * breadth;
        System.out.println("Area = " + a);
    }

    void perimeter()
    {
        int p = 2 * (length + breadth);
        System.out.println("Perimeter = "+ p); 
    }
}

public class funcrect {
    public static void main(String[] args)
    {
        rectangle a , b;

        a = new rectangle();
        b = new rectangle();
        a.length = 3;
        b.breadth = 4;
        a.breadth= 3;
        b.length = 4;
        a.perimeter();
        b.perimeter();
        a.area();
        b.area();
    }
}

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

    public void setdimension(int l, int b){
        length = l;
        breadth = b;
    }
}

public class setterfunc {
    public static void main(String[] args)
    {
        rectangle a , b;

        a = new rectangle();
        b = new rectangle();
        a.setdimension(3, 7);
        b.setdimension(4, 6);
        a.perimeter();
        b.perimeter();
        a.area();
        b.area();
    }
}




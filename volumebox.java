class cube{
    private int l , b , h;
    public void volume(){
        int c = l * b * h;
        System.out.println("Volume = "+ c);
    } 
    public void setdimension(int x , int y , int z){
        l = x;
        b = y;
        h = z;
    }
}
public class volumebox {
    public static void main(String[] args)
    {
        cube a , b ;
        a = new cube();
        b = new cube();
        a.setdimension(3, 7, 9);
        b.setdimension(4, 7, 8);
        a.volume();
        b.volume();
    }
}

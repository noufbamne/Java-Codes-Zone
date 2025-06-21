public class marksclass {
    public static void main(String[] args)
    {
        double p = 90;

        if (p > 75 ) {
            System.out.println("Distinction.");
        }
        else if (p >= 60) {
            System.out.println("1st Class.");
        }
        else if (p >= 50) {
            System.out.println("2nd Class.");
        }
        else if (p >= 40) {
            System.out.println("3rd Class.");
        }
        else{
            System.out.println("Fail.");
        }
    }
}

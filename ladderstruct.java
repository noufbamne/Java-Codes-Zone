public class ladderstruct {

    public static void main(String[] args)
    {
        double per = 80.00;

        if (per >= 75) {
            System.out.println("Distinction.");
        }
        else if (per >= 60) {
            System.out.println("Ist division");
        }
        else if (per >= 50) {
            System.out.println("IInd division");
        }
        else if (per >= 40) {
            System.out.println("IIIrd division");
        }
        else if (per >= 35) {
            System.out.println("Pass");
        }
        else
        System.out.println("Student fail!");
    }
}
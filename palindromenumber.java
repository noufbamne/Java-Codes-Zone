 public class palindromenumber {
    public static void main(String[] args) {
        int n=171;
        int sum=0;
        int m=n;
        while(n>0) {
          int d= n%10;
          sum=(sum*10)+d;
          n=n/10;

        }
        if(m==sum) {
            System.out.println(m+" is a palindrome number"); }
            else
            System.out.println(m+" is not a palindrome number");
        }
}

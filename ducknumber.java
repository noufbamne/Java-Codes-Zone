public class ducknumber {
    public static void main(String[] args) {
        int n=303;
         int m=n;
        int count=0;
        while(n!=0) {
            int d= n%10;
            if (d==0) count++ ;
                n=n/10;
            }
if (count>0) {
    System.out.println(m+"  is a duck number");
}
else
System.out.println(m+" is not duck number");
            
                
    }
            
}


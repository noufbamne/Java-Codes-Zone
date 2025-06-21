public class spynumber {
        public static void main(String[] args) {
            int n=123;
            int sum=0,prod=1;
            int temp=n;
    
            while(temp>0) {
                int d= temp%10;
                 sum+=d;
                prod*=d;
                temp/=10;
    
    
            }
            if (sum==prod) {
                System.out.println(n +" is a Spy number");
            }
            else
            System.out.println(n+" is not a Spy number");
                
            }
        }


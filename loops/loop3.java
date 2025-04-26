import java.util.*;
// check number is armstrong number
class loop3{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=n;
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum+=Math.pow(r,3);
            n/=10;
        }
        if(sum==m){
            System.out.println(sum);
           System.out.println("yes, it is armstrong");
        }
        else{
            System.out.println("no");
        }
        
    }
}
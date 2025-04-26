import java.util.*;
//count the number of digits
class loop2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
     while(n!=0){
        count++;
        n/=10;
     }
   System.out.print(count);
    }
}
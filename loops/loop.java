import java.util.*;
public class loop{
public static void main(String[] args){
    //display all digit of number
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
     while(n!=0){
        System.out.println(n%10);
        n/=10;
     }
    
}
}
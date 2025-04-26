import java.util.*;
//check the number is palindrome or not
class loop4{
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n =s.nextInt();
      int m=n;
      int rev=0;
      while(n!=0){
        rev=rev*10+(n%10);
        n/=10;
      }
      if(rev==m){
        System.out.println("yes,it is palindrome number");
      }
      else{
        System.out.println("no,it is not palindrome");
      }
    }
    }

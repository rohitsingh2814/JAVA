import java.util.*;
class stringpalindrome{
      public static boolean palindrome(String str){
               int i=0;
               int j=str.length()-1;
               while(i<j){
                if(str.charAt(i)!=str.charAt(j)){
                    return false;
                }
                    i++;
                    j--;
                
                
               }
               return true;
      }
        public static void main(String[] args) {
            Scanner s=new Scanner (System.in);
            System.out.print("Enter a string to check is Palindrome or not: ");
            String str=s.nextLine();
           boolean result= palindrome(str);
           if(result){
            System.out.printf("%s Is PAlindrome String",str);
           }
           else{
            System.out.printf("%s Is Not PAlindrome String",str);
           }
            
        }
}
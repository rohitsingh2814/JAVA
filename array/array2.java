import java.util.*;
class array2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A[]=new int[5];
        for(int i=0;i<A.length;i++){
           A[i]=s.nextInt();
        }
        
    
       for(int x:A){
        System.out.println(x+" ");
       }
       
       
       }
} 
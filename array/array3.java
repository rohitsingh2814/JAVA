import java.util.*;
class array3{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float arr[]=new float[5];
        for(int i=0;i<=arr.length;i++){
            arr[i]=s.nextFloat();
        }
        for(float x:arr){
            System.out.println(x);
        }
    }
}
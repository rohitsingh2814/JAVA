
import java.util.*;

class array4{
    public static void main(String[] args) {
        int arr[]={3,5,2,8,1,7,2,7};
        //sum of element
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        System.out.println("Sum of all element in a array: "+sum);
        //largest element in array
        int largest=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>largest){
                largest=x;
            }
        }
        System.out.println("Largest element in the array: "+largest);
        //second largest
        int max1=arr[0];
        int max2=max1;
        for(int x:arr){
            if(x>max1){
                
                max2=max1;
                max1=x;
            }
            else if(x>max2){
                max2=x;
            }

        }
        System.out.println("Second largest element is :"+max2);
        //search element
        int k=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println(k+ " Present at index "+i+" in the array");

            }
            
        }
        //right rotation one time
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println("");
        System.out.print("sorted array: ");
        Arrays.sort(arr);
         for(int x:arr){
            System.out.print(x+" ");
        }
    }

}
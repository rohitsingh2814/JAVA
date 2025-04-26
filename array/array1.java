
class array1{
    public static void main(String[] args) {
        
      int[] arr={10,34,56,78,89,34};
      int n=arr.length;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
      }
      System.out.println(max);
    }
}
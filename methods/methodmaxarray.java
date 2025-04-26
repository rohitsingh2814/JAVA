class methodmaxarray{
    static int maxarray(int A[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
               if(A[i]>max){
                max=A[i];
               }
        }
        return max;
    }
    public static void main(String[] args) {
        int A[]={10,2,5,70,36,89,0};
        System.out.println("The max element in the array: "+maxarray(A));
    }

}
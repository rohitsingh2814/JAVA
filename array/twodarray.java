import java.util.*;
class twodarray{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[][]=new int[3][5];
        for(int i=0;i<arr.length;i++){
                   for(int j=0;j<arr[i].length;j++){
                         arr[i][j]=s.nextInt();
                   }
        }
        for(int x[]:arr){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
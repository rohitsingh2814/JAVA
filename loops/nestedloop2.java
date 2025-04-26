class nestedloop2{
    public static void main(String[] args){
    
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                
                System.out.print(j+" ");
            }
            System.out.println("");
            }
}}
// 01 
// 01 02
// 01 02 03
// 01 02 03 04
// 01 02 03 04 05


// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1
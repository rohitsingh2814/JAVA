class methodprime{
    static boolean prime(int x){
        if(x==1||x==2){
            return true;
        }
        for(int i=2;i<=x/2;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int x=19;
        if(prime(x)){
            System.out.println("yes it is prime number");
        }
        else{
            System.out.println("yes it is not prime number");
        }
    }
}
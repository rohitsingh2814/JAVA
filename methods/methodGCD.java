class methodGCD{
    static int gcd(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a=25,b=15;
        System.out.format("GCD of %d and %d is %d",a,b,gcd(a,b));
    }
}
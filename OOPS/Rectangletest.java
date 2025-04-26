class rect{
  private int length;
  private int breath;
  
  public int getLength(){
    return length;
  }
  public int  getBreath(){
    return breath;
  }
  public void setLength(int l){
    length=l;
  }
   public void setBreath(int b){
    breath=b;
  }
  public rect(){
    length=1;
    breath=1;
  }
  public rect(int l,int b){
    // length=l;
    // breath=b;
    setLength(l);
    setBreath(b);
  }
  public int area(){
    return length*breath;
  }
  public int prerimeter(){
    return 2*(length+breath);
  }
}


class Rectangletest{
    public static void main(String args[]){
         rect r=new rect(10,20);
        //  r.setLength(10);
        //  r.setBreath(30);
         System.out.println(r.area());
         System.out.println(r.prerimeter());
    }
}
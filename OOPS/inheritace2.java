//how to call parametized conatrutor of parent class=>using super();
class rect{
    int length;
    int breath;
    rect(){
        length=breath=1;
        System.out.println("non-paramazied of rect");
    }
    rect(int l,int b){
        length=l;
        breath=b;
        System.out.println("paramazied of rect");

    }


}
class cuboid extends rect{
    int height;
    public cuboid(){
       height=1;
        System.out.println("non-paramazied of cuboid");
    }
    public cuboid(int h){
        height=h;
         System.out.println("paramazied of cuboid");

    }
    public cuboid(int l,int b,int h){  //this constructor called the parametized construtor of parent class using super keyword;
        super(l,h);
        height=h;
        System.out.println("another paramazied of cuboid");
    }
   public  int volume(){
        return length*breath*height;
    }
}
class inheritace2{
    public static void main(String[] args) {
        cuboid c=new cuboid(4,6,7);
        System.out.println("volume: "+c.volume());
    }
}
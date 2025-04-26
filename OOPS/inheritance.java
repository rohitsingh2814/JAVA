class parent{
    public int x;
    public parent(){
        x=2;
        System.out.println("parent constructor");
    }

}
class child extends parent{
    public int x;
    public child(){
        x=5;
        System.out.println("child constructor");
    }
    public void display(){
        System.out.println(super.x);
        System.out.println(x);
    }

}
class inheritance{
    public static void main(String[] args) {
        child c=new child();
        c.display();
    }
}
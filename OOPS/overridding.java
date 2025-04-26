class parent{
    public void display(){
        System.out.println("hello");
    }
}
class child extends parent{
     public void display(){
        System.out.println("hello world");
    }
}
class overridding{
    public static void main(String[] args) {
        parent p=new parent();
        p.display();//hello ->only call the parents methods

        child c=new child();
        c.display();//hello world -> call the child methods and override the parent class method

        //dyanmic method dispatch
        parent p1=new child();
        p1.display();//call the object(child) class method not the reference(super) class

        

    }
}
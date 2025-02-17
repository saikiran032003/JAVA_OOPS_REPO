//dynamic method dispatch 
class A{
    void callme()
    {
        System.out.println("hanuman");
    }
}
class B extends A{
    void callme(){
        System.out.println("pavanasutanama anjaniputra");
    }
}
class C extends B{
    void callme(){
        System.out.println("panchamuka hanuman");
    }
}
class Dispatch{
    public static void main(String args[]){
        A a=new A();
        B b=new B();
        C c=new C();
        A r;
        r=a;
        r.callme();
        r=b;
        r.callme();
        r=c;
        r.callme();
    }
}
/*output
hanuman
pavanasutanama anjaniputra
panchamuka hanuman*/
//Variable hiding
class A{
        int x=10;
}
class B extends A{
        int x=1099;
}
class Dispatch{
    public static void main(String args[]){
    A a=new B();
    System.out.println(a.x);
}
}
/*output
    10*/

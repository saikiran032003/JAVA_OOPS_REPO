class Override{
    void method(){
        System.out.println("chanting lord rama is very powerful");
    }
}
class Override1 extends Override{
    void method(){
        System.out.println("chanting lord krishna can solve our problems");
    }
}
class Testoveride{
    public static void main(String args[]){
        Override m1=new Override();
        m1.method();
        Override1 m2=new Override1();
        m2.method();
        Override m3=new Override1();
        m3.method();
    }
}
/*output
Chanting Lord Rama is very powerful
Chanting Lord Krishna can solve our problems
Chanting Lord Krishna can solve our problems*/

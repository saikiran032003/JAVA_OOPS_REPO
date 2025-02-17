//constructor overloading
class Pconstructor{

    int a;
    char b;
    String c;
    Pconstructor(int x){
        a=x;
        System.out.println("1st constructor:"+x);

    }
    Pconstructor(int x,char y){
        a=x;
        b=y;
        System.out.println("2nd constructor:"+x+y);
    }
    Pconstructor(int x,char y,String z){
        a=x;
        b=y;
        c=z;
        System.out.println("3rd constructor:"+x+" "+y+" "+z);
    }
    public static void main(String args[]){
        Pconstructor obj=new Pconstructor(10,'d',"sai"); //calls third constructor
        Pconstructorm s=new Pconstructor(1,'s',"kiran"); //calls third constructor
    }
     
     
}
/* output
3rd constructor: 10 d sai
3rd constructor: 1 s kiran */


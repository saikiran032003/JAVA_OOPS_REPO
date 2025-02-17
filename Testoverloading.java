class overloading{
    public void add(int a,int b){
        System.out.println(a+b);}
        public void add(int a,int b,int c){
            System.out.println(a+b+c);
        }
        public void add(int a,int b,int c,int d){
            System.out.println(a+b+c+d);
        }
    }
    public class Testoverloading{
        public static void main(String args[]){
            overloading s=new overloading();
            s.add(1,2);
            s.add(4,5,6);
            s.add(1,3,4,9);
        }
    }
/*output
 3
15
17*/

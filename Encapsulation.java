 class Encapsulation {
    int roll,marks;
    String v;
    Student(){
        this.roll=1;
        this.v="sai";
        this.marks=10;
    }
    void greeting(){
        System.out.println("my name is" +this.v);
    }
    public static void main(String[] args){
       Student obj=new Student();
        System.out.println(obj.roll);
        System.out.println(obj.v);
        System.out.println(obj.marks);
    }
}

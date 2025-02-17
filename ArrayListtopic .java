// arraylist creation 
import java.io.*;
import java.util.*;
class Gener{
    public static void main(String args[]){
        int n=5;
        ArrayList<Integer> arr=new ArrayList<Integer>(n);
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        System.out.println(arr);
        System.out.println(arr1);
        for(int i=1;i<=n;i++){
        arr.add(i);
        arr1.add(i);
        }
        System.out.println(arr);
        System.out.println(arr1);
    }
}
//insertion an element at anindex in arraylist
import java.util.*;
class Gener{
    public static void main(String args[]){
        ArrayList<String> a=new ArrayList<String>();
        a.add("lalitha");
        a.add("matha");
        a.add(1,"devi");
        System.out.println(a);
    }
}
//replacement ofobjects through set method
 import java.util.*;
class Gener{
    public static void main(String args[]){
        ArrayList<String> a=new ArrayList<String>();
        a.add("jaisreeram");
        a.add("hanuman");
        a.add(0,"shivudu");
        System.out.println(a);
        a.set(2,"lakshman");
        System.out.println(a);
    }
}
// removing objects from arraylist
import java.util.*;
class Gener{
    public static void main(String args[]){
        ArrayList<String> a=new ArrayList<String>();
        a.add("krishna");
        a.add("karna");
        a.add("arjuna");
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.remove("karna");
        System.out.println(a);
    }
}

// iterate elements and find index
import java.util.*;
class Gener{
    public static void main(String args[]){
        ArrayList<String> a=new ArrayList<String>();
        a.add("bheema");
        a.add("arjuna");
        a.add("karna");
        for(int i=0;i<a.size();i++)
        {
            System.out.print(" "+a.get(i));
        }
        System.out.println();
        for(String str:a)
        System.out.print(" "+str);
         System.out.println();
        String n=a.get(1);
        System.out.println(n);

    }
}
import java.util.*;
class Gener{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(3);
        a.add(2);
        a.add(8);
        a.add(1);
        System.out.println("before sorting:"+a);
        Collections.sort(a);
        System.out.println("after sorting:"+a);
        int n=a.size();
        System.out.println(n);
    }
}

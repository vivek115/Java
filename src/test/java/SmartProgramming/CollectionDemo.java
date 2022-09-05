package SmartProgramming;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("abc");
        al.add("aaa");
        al.add("ter");
       // System.out.println(al.add("qqq"));
        //this will also return value in boolean // add method return type value is boolean
//        System.out.println(al);
//        System.out.println(al.contains(200));
//        // to check the collection object is empty or not so we used empty method over there
//        System.out.println(al.isEmpty());
//        // to check the size the of the collection object
//        System.out.println(al.size());
//        // to remove the element from collection object
//       al.remove(1);
//        System.out.println(al);
        ArrayList al1 = new ArrayList();
        al1.add("abc");
        al1.add("cde");
        al1.add("fgh");
        al.addAll(al1);
        al.removeAll(al1);
        // this remove all method is used to remove all the elements from collection object which is having same elements in the collection object
        // clear the all the elements from the collections object
        al.clear();
        System.out.println(al);
        System.out.println(al1);
    }
}
// add() method,contains() method, isempty() method, size() , remove(), removeAll() , clear()
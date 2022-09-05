package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("vicky");
        list.add("raman");
        list.add("sahil");
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

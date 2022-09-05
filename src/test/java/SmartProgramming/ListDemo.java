package SmartProgramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        List l = new ArrayList<>();
        l.add(100);
        l.add(200);
        l.add(300);
        Iterator itr=l.listIterator();
        //Iterator itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

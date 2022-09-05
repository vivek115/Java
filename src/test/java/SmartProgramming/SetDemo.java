package SmartProgramming;

import java.util.*;

public class SetDemo {
    public static void main(String[] args){
        Set l = new HashSet();
        l.add(100);
        l.add(200);
        l.add(300);
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

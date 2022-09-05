package Collection;

import java.util.*;

public class Test {
        public static void main(String[] args)
        {

            // Creating a hash set of strings
            Set<String> s = new HashSet<String>();
            s.add("Geeks");
            s.add("for");

            List<String> aList = new ArrayList<String>();
            aList.addAll(s);

            System.out.println("Created ArrayList is");
            for (String x : aList)
                System.out.println(x);

//            List<String> lList = new LinkedList<String>();
//            lList.addAll(s);
//
//            System.out.println("Created LinkedList is");
//            for (String x : lList)
//                System.out.println(x);
        }
    }


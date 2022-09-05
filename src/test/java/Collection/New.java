package Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class New {

        public static void main(String[] args)
        {

            // Creating a hash set of strings
            Set<String> s = new HashSet<String>();
            s.add("Geeks");
            s.add("for");

            List<String> aList
                    = s.stream().collect(Collectors.toList());

            for (String x : aList)
                System.out.println(x);
        }
    }


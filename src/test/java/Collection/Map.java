package Collection;

import java.util.HashMap;

public class Map {

    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String, String>();
        hm.put("Katie", "Android, WordPress");
        hm.put("Magda", "Facebook");
        hm.put("Vanessa", "Tools");
        hm.put("Ania", "Java");
        hm.put("Ania", "JEE");
        System.out.println("Size of map is:- "
                + hm.size());
        System.out.println(hm);
        if (hm.containsKey("Magda")) {

            // Mapping
            String a = hm.get("Magda");

            // Printing value fr the corresponding key
            System.out.println("value for key"
                    + " \"vishal\" is:- " + a);
        }
    }
}

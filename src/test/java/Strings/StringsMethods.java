package Strings;

public class StringsMethods {
    public static void main(String[] args) {
        String str = "vivEk";
        // str.length will return the length of string
        // different method in string str.toLowerCase() and str.toUpperCase
        // int value = str.length();
        //String character = str.toLowerCase();
//        String character = str.toUpperCase();
//        System.out.println(character);
        //System.out.println(value);
        // trim method in string is used to return a new string after removing all leading
        // and trailing spaces  from original string
//        String nonTrimStrig = "   vivek    ";
//        System.out.println(nonTrimStrig.trim());

        // we used substring method to print the string from start to end"
        // note- index start from 0
        //System.out.println(str.substring(3));
        // if we provide the index from start to end then it will return the end string with -1
        // like 1 to 4 it will return 1 to 3 only not 4th one
        //System.out.println(str.substring(1,4));
        // we used replace method and startwith method & endwith method (it will return value in booloean) in string also
// we also used charat method in string
        // we used indexof(string) method in string
//        System.out.println(str.charAt(3));
//        System.out.println(str.startsWith("viv"));
//        System.out.println(str.endsWith("ek"));
//        System.out.println(str.indexOf("k"));
//        String name = "vivekekviv";
//        System.out.println(name.indexOf("k",4));
//        System.out.println(name.lastIndexOf("vek",5));
//        System.out.println(str.equals("vivEk"));
//        // equalignorecase is used to ignore the case(lower or upper) it will just match the value of the string
//        System.out.println(str.equalsIgnoreCase("vivek"));
        System.out.println(str.toLowerCase());
        // problem 2 replace space with underscore
        String text = "hello vivek";
        text=text.replace(" ","_");
        System.out.println(text);

        //problem 3- replace the name with vivek in string

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","vivek");
        System.out.println(letter);

        // problem 4- to rectify the spaces in the string

        String mystring = "This strings contains  double and triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //problem 5-
         String glitter  = "Dear vivek,\n\tcourse is very good";
        System.out.println(glitter);

    }
}

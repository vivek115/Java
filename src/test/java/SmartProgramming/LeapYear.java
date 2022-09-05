package SmartProgramming;

public class LeapYear {
    // if year is divided by 400 then it is leap year
    // if year is divided ny 4 then it is a leap year
    // if year is divided by 100 then it is not a leap year
    public static  void main(String[] args) {
        int year = 2016;
//        if(year%4==0){
//            if(year%100==0){
//                if(year%400==0){
//                    System.out.println("it is a leap year");
//                }else{
//                    System.out.println("it is not a leap year");
//                }
//                System.out.println("it is not a leap year");
//            }else{
//                System.out.println("it is a leap year");
//            }
//            System.out.println("it is leap year");
//        }
//        else {
//            System.out.println("Not a leap year");
//        }
//    }
        // or way
        if((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}


package integertoday;

import java.util.Scanner;

/**
 *
 * @author kokonoula
 */
public class IntegerToDay {

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Number of the day..:");
           int day=sc.nextInt();
           
    switch(day){
        case(1):
            System.out.println(day+"= Monday");
            break;
        case(2):
            System.out.println(day+"= Tuesday");
            break;
        case(3):
            System.out.println(day+"= Wednesday");
            break;
        case(4):
            System.out.println(day+"= Thursday");
            break;
        case(5):
            System.out.println(day+"= Friday");
            break;
        case(6):
            System.out.println(day+"=Saturday");
            break;
        case(7):
            System.out.println(day+"= Sunday");
            break;
        default:
            System.out.println("Invalid number! 1-7 please!");
    
    }
    }
    
}

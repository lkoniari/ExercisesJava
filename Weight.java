
package weight;

import java.util.Scanner;

public class Weight {


    
    public static void main(String[] args) {
        System.out.println("What is your weight(in kilos)?");
        Scanner sc=new Scanner(System.in);
        double mass= sc.nextDouble();
       // System.out.println("your mass is: " + mass +" kg");
       
        System.out.println("Which planet are you on?");
        Scanner pl=new Scanner(System.in);
        String planet=pl.next();
        double weight;
        switch(planet){
            case"Venus":
                weight=mass*0.78;
                System.out.println("Your weight on "+planet+" is "+weight);
                break;
            case"Mars":
                weight=mass*0.39;
                System.out.println("Your weight on "+planet+" is "+weight);
                break;
            case"Jupiter":
                weight=mass*2.65;
                System.out.println("Your weight on "+planet+" is "+weight);
                break;
            case"Saturn":
                weight=mass*1.17;
                System.out.println("Your weight on "+planet+" is "+weight);
                break;
            case"Uranus":
                weight=mass*1.05;
                System.out.println("Your weight on "+planet+" is "+weight);
                break;
            case"Neptune":
                weight=mass*1.23;
                System.out.println("Your weight on "+planet+" is "+weight);
                break;
            default:
                System.out.println("No planet match!!!");

        }
    }
    
    
    
}

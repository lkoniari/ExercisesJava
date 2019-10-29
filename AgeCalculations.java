
package agecalculations;


public class AgeCalculations {

    public static void main(String[] args) {
            int age1 = 34;
            int currentYear = 2019;
            int age2 = 62;
            int age3 = 21;
            int age4 = 88;
            int birthdate1 = currentYear - age1;
            System.out.println("You were born in " + birthdate1);
            
            int birthdate2 = currentYear - age2;
            System.out.println("Kostas was born in " + birthdate2);
            
            int birthdate3 = currentYear - age3;
            System.out.println("Nasia was born in " + birthdate3);
            
            int birthdate4 = currentYear - age4;
            System.out.println("Lamprini was born in " + birthdate4);
            
            int pastBD1 = 1960 - birthdate1 ; 
            if(pastBD1 <=0){
                System.out.println("Not born yet");
            }else{
                System.out.println("In 1960 you wwere " + pastBD1 +" years old");
            }
            
            int pastBD2 = 1960 - birthdate2 ; 
            if(pastBD2 <=0){
                System.out.println("Not born yet");
            }else{
                System.out.println("In 1960 Kostas was " + pastBD2 +" years old");
            }
            
            int pastBD3 = 1960 - birthdate3 ; 
            if(pastBD3 <=0){
                System.out.println("Not born yet");
            }else{
                System.out.println("In 1960 Nasia was" + pastBD3 +" years old");
            }
            
            int pastBD4 = 1960 - birthdate4 ; 
            if(pastBD4 <= 0){
                System.out.println("Not born yet");
            }else{
                System.out.println("In 1960 Lamprini was " + pastBD4+" years old");
            }
            
            System.out.println("In 2040 I will be " + (2040 - birthdate1)+ " years old");
            System.out.println("In 2040 Kostas will be " + (2040 - birthdate2)+ " years old");
            System.out.println("In 2040 Nasia will be " + (2040 - birthdate3)+ " years old");
            System.out.println("In 2040 Lamprini will be " + (2040 - birthdate4)+ " years old");
    }
    
}
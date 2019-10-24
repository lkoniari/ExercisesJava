package stringexamples;

public class StringExamples {

    public static void main(String[] args) {
        
        

        String name = "Nick";
        String lastName = " Nikolopoulos ";

        //concat
        String name1 = name.concat(" Nikolaou");
        System.out.println(name1);

        //lenght
        int length = name.length();
        System.out.println("to mikos tou " + name + " einai " + length);

        //equals 
        boolean bool = name.equals("Nickos");
        System.out.println(name + " is equal to Nickos : " + bool);

        //charAt---epistrefei ton xaraktira poy vriskete sti thesi 2
        
        char letter = name.charAt(2);
        System.out.println(letter);

        //indexOf
        int w = name.indexOf("c");
        System.out.println("to index tou c einai to : " + w);

        //toLowerCase
        String lower = name.toLowerCase();
        System.out.println(lower);

        //toUperCase
        String upper = name.toUpperCase();
        System.out.println(upper);

        //trim
        String trimed = lastName.trim();
        System.out.println("|" + lastName + "|");
        System.out.println("|" + trimed + "|");

        //split 
        String wholeName = "Lamprini Koniari";
        String[] words = wholeName.split(" ");
        for(int i=0; i<words.length;i++){
            System.out.println(words[i]);
        }
        

        //subString
        String string = "Alohomora";
        String substr= string.substring(3, 7);
        System.out.println(substr);
        
        //replace
        String sisters = "Noula+Elena+Nasia";
        
        String replaced = sisters.replace("+", " ");
        System.out.println(replaced);
        
        //compare
        
        String name11="Lamprini";
        String name22="Lamprikatsou";
        String name33="lamprini";
        
        
        int compare = name11.compareTo(name22);
        System.out.println(compare);
        
        //compareTo
        int compare2 = name11.compareToIgnoreCase(name22);
        System.out.println(compare2);
        
        //endsWith
        Boolean endName = name11.endsWith("i");
        System.out.println(endName);
        System.out.println(name22.endsWith("a"));
        
        //equalsIgnoreCase
        
        Boolean boll=name11.equalsIgnoreCase(name33);
        System.out.println(boll);
        
        //startsWith
        Boolean z=name11.startsWith("L");
        System.out.println(z);
        System.out.println(name33.startsWith("L"));
        System.out.println(name22.startsWith("p",4));
        
        
        
        
        

//        for(int i=0; i<words.length;i++){
//            System.out.println(words[i]);
//        }
//       
//        for (String myWord : words) {
//            /*gia kathe timi toy array words*/
//            System.out.println(myWord); 
//            /*tipose to stoixeio*/
//        }




        //
//        String message = newMethod();
//        System.out.println(message);
//        
//        String age = ageMethod(34);
//        System.out.println(age);
//        
//        String tsaftsouf = thirdMethod(32 , "Thrassivoulas");
//        System.out.println(tsaftsouf);

//        String fullName = myLastMethod("Lamprini", "Koniari");
//        System.out.println(fullName);
    }
        
}

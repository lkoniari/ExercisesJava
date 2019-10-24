package controlflow;

public class ControlFlow {

    public static void main(String[] args) {
        int age = 13;

        if (age==7) {
            System.out.println("You are going to first grade");
        }else if (age==8) {
            System.out.println("You are going to second grade");
        }else if (age==9) {
            System.out.println("You are going to third grade");
        }else if (age==10) {
            System.out.println("You are going to fourth grade");
        }else if (age==11) {
            System.out.println("You are going to fifth grade");
        }else if (age==12) {
            System.out.println("You are going to sixth grade");
        }else if (age > 12 && age < 18) {
            System.out.println("You are going to highschool");
        }else if (age > 18) {
            System.out.println("You are too old to go to school");
        }else if (age < 7 && age > 0) {
            System.out.println("You are too young to go to school");
        }else {
            System.out.println("Invalid age");
        }

    }

}

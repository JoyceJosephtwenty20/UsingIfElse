import java.util.Scanner;

public class UsingIfElse {
    public static void main(String[] args){
        int age =9;
        if(age >= 18){ // do not use double "==" with strings.
            System.out.println("It's an adult");
        }
        else if(age >= 13){
            System.out.println("It's a teen");
        }
        else if (age < 8){
            System.out.println("It's a child");
        }
        else{
            System.out.println("It's a minor");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Please say Hello to your classmates?\n");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("Hello")){
            System.out.println("Greetings");
        }



    }
}

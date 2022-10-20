import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String input;
        String answer;
        boolean go = true;
        Scanner in = new Scanner(System.in);

        while (go){
            System.out.println("Hi there! Please input something");
            input = in.nextLine();

            System.out.println("You typed: " + input.toUpperCase());

            System.out.println("Do you want to continue? If so type Y or type any other letter to stop.");
            answer = in.nextLine();

            if (!(answer.equalsIgnoreCase("y"))){
                System.out.println("Sad to see you go.");
                go = false;
            }
        }
    }
}
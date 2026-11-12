package RockPaperScissor;
import java.util.Random;
import java.util.Scanner;

public class RPSApplication {

    public static void main(String[] args) {

        String arr[] = {"Rock", "Paper", "Scissor"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user choice 0 to 2: ");
        int userchoice = sc.nextInt();
        while (userchoice < 0 || userchoice >= 3) {
            System.out.println("Invalid choice. Please enter valid choice:");
            userchoice = sc.nextInt();
        }
        String us = arr[userchoice];
        System.out.println("User Choice: " + us);
        Random rm = new Random();
        int comch = rm.nextInt(3);
        String comchoice = arr[comch];
        System.out.println("Computer Choice: " + comchoice);
        if ((us.equals("Rock") && comchoice.equals("Scissor")) ||
            (us.equals("Scissor") && comchoice.equals("Paper")) ||
            (us.equals("Paper") && comchoice.equals("Rock"))) {
        	
                   System.out.println("User Wins!");
        }
        else if (us.equals(comchoice)) {
            System.out.println("Game Tie!");
        }
        else {
            System.out.println("Computer Wins!");
        }
    }
}

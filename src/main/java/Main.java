import com.magicarena.controller.ArenaController;
import com.magicarena.model.Player;

import java.sql.SQLOutput;
import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String regex = "^[a-zA-Z ]+$";



        System.out.println("Player A , Please enter you name : ");
        String playernameA = sc.next();

        if (playernameA.isEmpty()) {
            System.out.println("Input cannot be empty. Please enter valid text:");
        } else if (!playernameA.matches(regex)) {
            System.out.println("Invalid input. Only letters and spaces are allowed. Please try again:");
            System.exit(1);
        }


        System.out.println("Enter player A's health attribute : ");
        int healthA = sc.nextInt();
        System.out.println("Enter player A's strength attribute : ");
        int strengthA = sc.nextInt();
        System.out.println("Enter player A's attack attribute : ");
        int attackA = sc.nextInt();


        System.out.println("Player B , Please enter you name : ");
        String playernameB = sc.next();

        if (playernameB.isEmpty()) {
            System.out.println("Input cannot be empty. Please enter valid text:");
        } else if (!playernameB.matches(regex)) {
            System.out.println("Invalid input. Only letters and spaces are allowed. Please try again");
            System.exit(1);

        }

        System.out.println("Enter player B's health attribute : ");
        int healthB = sc.nextInt();
        System.out.println("Enter player B's strength attribute : ");
        int strengthB = sc.nextInt();
        System.out.println("Enter player B's attack attribute : ");
        int attackB = sc.nextInt();

        if(healthA<0||healthB<0||strengthA<0||strengthB<0||attackA<0||attackB<0)
        {
            System.out.println("Please enter positive values only");
        }
        else {

            Player playerA = new Player(healthA, strengthA, attackA, playernameA);
            Player playerB = new Player(healthB, strengthB, attackB, playernameB);

            ArenaController arena = new ArenaController(playerA, playerB);
            System.out.println("Starting the fight...");
            arena.startfight();

        }

    }
}

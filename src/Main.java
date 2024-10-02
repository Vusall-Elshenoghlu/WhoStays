import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter count of players: ");
        int countPlayers = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> players = new ArrayList<>();
        for (int i = 1; i < countPlayers + 1; i++) {
            if (i == 1){
                System.out.println("Enter the name of 1st player: ");
                players.add(scanner.nextLine());
            } else if (i == 2) {
                System.out.println("Enter the name of 2nd player: ");
                players.add(scanner.nextLine());
            } else if (i == 3) {
                System.out.println("Enter the name of 3rd player: ");
                players.add(scanner.nextLine());
            }else {
                System.out.println("Enter the name of " + (i) + "th player: ");
                players.add(scanner.nextLine());
            }
        }

        System.out.println(players);

        System.out.println("Game has started!");

        while (players.size() > 1){
            int index1 = random.nextInt(players.size());
            int index2;
            do {
                index2 = random.nextInt(players.size());
            }while (index1 == index2);

            String player1 = players.get(index1);
            String player2 = players.get(index2);

            System.out.println("Who is stayed? " + player1 + " or " + player2 + "? (you can use pass)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase(player1)){
                System.out.println(player2 + " is eliminated!");
                players.remove(player2);
            } else if (choice.equalsIgnoreCase(player2)) {
                System.out.println(player1 + " is eliminated!");
                players.remove(player1);
            } else if (choice.equalsIgnoreCase("pass")) {
                System.out.println("nobody is eliminated...Game is going on!");
            }
            else {
                System.out.println("You choised wrong...Nobody is eliminated...The game is going on!");
            }

        }
        System.out.println("Winner: " + players.get(0));
        System.out.println("The game has finished...See you next games :)");


    }
}
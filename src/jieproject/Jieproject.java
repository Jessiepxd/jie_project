package jieproject;

import java.util.ArrayList;
import java.util.Scanner;
import static jieproject.NameValidator.isValidNameLength;
import static jieproject.RoundValidator.totalRoundNumberChecker;
import static jieproject.PickCardChecker.isValidCard;

public class Jieproject {

    public static void main(String[] args) {
        // user set the players' names
        Scanner input = new Scanner(System.in);
        System.out.print("Enter player1's name (3 to 8 characters): ");
        String p1Name = input.next();
        if (!isValidNameLength(p1Name)) {
            System.out.println("Name is empty or contain only whitespace. Exiting the program.");
            System.exit(1);
        }
        input = new Scanner(System.in);
        System.out.print("Enter player2's name  (3 to 8 characters): ");
        String p2Name = input.next();
        if (!isValidNameLength(p2Name)) {
            System.out.println("Name is empty or contain only whitespace. Exiting the program.");
            System.exit(1);
        }

        // set the player objects with name and points
        Player p1 = new Player(p1Name, 0);
        Player p2 = new Player(p2Name, 0);
        Player[] players = {p1, p2};

        // set how many rounds you'd like to play
        System.out.print("Please enter number of rounds you'd like to play (integer greater than 0): ");
        String roundInputString = input.next();
        int num = Integer.parseInt(roundInputString);
        if (!totalRoundNumberChecker(roundInputString)) {
            System.out.println("The input is not an integer greater than 0. Exiting the program.");
            System.exit(1);
        }
        ArrayList<Card> hand1 = Hand.generateHand(num);
        ArrayList<Card> hand2 = Hand.generateHand(num);

        // the card that given by each player
        Card handGive1, handGive2;

        // loop through all rounds
        for (int i = 1; i < num + 1; i++) {
            System.out.println();
            System.out.println("---------------------------- Round " + i + "/" + num + " ----------------------------");
            // print the cards in player1
            System.out.println();
            System.out.println("Cards in hand1 (" + p1.getName() + ")");
            for (Card c : hand1) {
                System.out.print(c.getSuit() + " of " + c.getRank() + "\t\t");
            }
            // let player1 choose one card to give
            System.out.println();
            System.out.print(p1.getName() + ", Please choose a card (from 1 to " + hand1.size() + "): ");
            String p1c1Input = input.next();
            int p1c1 = Integer.parseInt(p1c1Input);
            if (!isValidCard(p1c1Input, hand1)) {
                System.out.println("You entered a card index greater than the total number of cards. Exiting the program.");
                System.exit(1);
            }

            handGive1 = hand1.get(p1c1 - 1);
            // print out the card chose by player1
            System.out.println(p1.getName() + " chose the card: " + handGive1.getSuit() + " of " + handGive1.getRank());
            // remove the chosen card from player1's hand
            hand1.remove(handGive1);

            // print the cards in player1
            System.out.println();
            System.out.println("Cards in hand2 (" + p2.getName() + ")");
            for (Card c : hand2) {
                System.out.print(c.getSuit() + " of " + c.getRank() + "\t\t");
            }
            // let player2 choose one card to give
            System.out.println();
            System.out.print(p2.getName() + ", Please choose a card (from 1 to " + hand2.size() + "): ");
            String p2c1Input = input.next();
            int p2c1 = Integer.parseInt(p2c1Input);
            if (!isValidCard(p2c1Input, hand2)) {
                System.out.println("You entered a card index greater than the total number of cards. Exiting the program.");
                System.exit(1);
            }
            handGive2 = hand2.get(p2c1 - 1);
            // print out the card chose by player2
            System.out.println(p2.getName() + " chose the card: " + handGive2.getSuit() + " of " + handGive2.getRank());
            // remove the chosen card from player2's hand
            hand2.remove(handGive2);
            System.out.println();

            // calculate points for each player
            if (handGive1.getSuitValue() == handGive2.getSuitValue()) {
                if (handGive2.getRankValue() > handGive1.getRankValue()) {
                    p1.setPts(p1.getPts() + 0);
                    p2.setPts(p2.getPts() + 6);
                    System.out.println(p1.getName() + ", got 0 points!");
                    System.out.println(p2.getName() + ", got 6 points!");

                    System.out.println();

                    System.out.println("> " + p1.getName() + "'s points: " + p1.getPts());
                    System.out.println("> " + p2.getName() + "'s points: " + p2.getPts());
                } else if (handGive2.getRankValue() == handGive1.getRankValue()) {
                    p1.setPts(p1.getPts() + 2);
                    p2.setPts(p2.getPts() + 4);
                    System.out.println(p1.getName() + ", got 2 points!");
                    System.out.println(p2.getName() + ", got 4 points!");

                    System.out.println();

                    System.out.println("> " + p1.getName() + "'s points: " + p1.getPts());
                    System.out.println("> " + p2.getName() + "'s points: " + p2.getPts());
                } else {
                    p1.setPts(p1.getPts() + 4);
                    p2.setPts(p2.getPts() + 2);
                    System.out.println(p1.getName() + ", got 4 points!");
                    System.out.println(p2.getName() + ", got 2 points!");

                    System.out.println();

                    System.out.println("> " + p1.getName() + "'s points: " + p1.getPts());
                    System.out.println("> " + p2.getName() + "'s points: " + p2.getPts());
                }
            } else {
                if (handGive2.getRankValue() > handGive1.getRankValue()) {
                    p1.setPts(p1.getPts() + 2);
                    p2.setPts(p2.getPts() + 4);
                    System.out.println(p1.getName() + ", got 2 points!");
                    System.out.println(p2.getName() + ", got 4 points!");

                    System.out.println();

                    System.out.println("> " + p1.getName() + "'s points: " + p1.getPts());
                    System.out.println("> " + p2.getName() + "'s points: " + p2.getPts());
                } else if (handGive2.getRankValue() == handGive1.getRankValue()) {
                    p1.setPts(p1.getPts() + 4);
                    p2.setPts(p2.getPts() + 2);
                    System.out.println(p1.getName() + ", got 4 points!");
                    System.out.println(p2.getName() + ", got 2 points!");

                    System.out.println();

                    System.out.println("> " + p1.getName() + "'s points: " + p1.getPts());
                    System.out.println("> " + p2.getName() + "'s points: " + p2.getPts());
                } else {
                    p1.setPts(p1.getPts() + 6);
                    p2.setPts(p2.getPts() + 0);
                    System.out.println(p1.getName() + ", got 6 points!");
                    System.out.println(p2.getName() + ", got 0 points!");

                    System.out.println();

                    System.out.println("> " + p1.getName() + "'s points: " + p1.getPts());
                    System.out.println("> " + p2.getName() + "'s points: " + p2.getPts());
                }
            }
        }

        // show the winner after all rounds
        System.out.println();
        System.out.println("----------------------------- Result -----------------------------");
        if (p1.getPts() > p2.getPts()) {
            System.out.println(p1.getName() + " IS THE WINNER !!!");
        } else if (p1.getPts() == p2.getPts()) {
            System.out.println("IT WAS A TIE GAME.");
        } else {
            System.out.println(p2.getName() + " IS THE WINNER !!!");
        }
    }
}

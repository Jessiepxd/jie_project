package jieproject;

import java.util.ArrayList;

/**
 * check if user chooses a card inside of the cards in hand
 *
 * @author Jie Chen
 */
public class PickCardChecker {

    public static boolean isValidCard(String userSelectedCard, ArrayList hand) {
        // ignores leading and trailing whitespaces in the input string before attempting to parse it into an integer.
        int number = Integer.parseInt(userSelectedCard);

        if (number > 0 && number < hand.size() + 1) {
            return true;
        } else {
            return false;
        }
    }
}

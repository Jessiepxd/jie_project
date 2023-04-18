package jieproject;

/**
 * checks if a user's input is an integer type and greater than 0 for total number of rounds.
 *
 * @author Jie Chen
 */
public class RoundValidator {

    public static boolean totalRoundNumberChecker(String roundInputString) {
        // ignores leading and trailing whitespaces in the input string before attempting to parse it into an integer.
        int number = Integer.parseInt(roundInputString);
        return number > 0;
    }
}

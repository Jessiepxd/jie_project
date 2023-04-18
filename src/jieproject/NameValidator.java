package jieproject;

/**
 * check if user enters a name with length between 3 and 8 (white space does not count)
 *
 * @author Jie Chen
 */
public class NameValidator {

    private static final int MINIMUM_LENGTH = 3;
    private static final int MAXMUM_LENGTH = 8;

    public static boolean isValidNameLength(String name) {
        // Removes all whitespaces
        String nameWithoutWhitespaces = name.replaceAll("\\s", "");
        int length = nameWithoutWhitespaces.length();

        return length >= 3 && length <= 8;
    }
}

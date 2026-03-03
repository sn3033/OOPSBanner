/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach to generate
 * each letter's pattern through dedicated static methods.
 *
 * @author Developer
 * @version 6.0
 */

public class OOPSBannerApp6 {

    // Method to generate the pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        };
    }

    // Method to generate the pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        };
    }

    // Method to generate the pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[]{
                " ******  ",
                "**    ** ",
                "**       ",
                " ******  ",
                "      ** ",
                "**    ** ",
                " ******  "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Populate arrays using helper methods
        String[] oPattern1 = getOPattern();
        String[] oPattern2 = getOPattern(); // Reuse for second 'O'
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop-based rendering (7 lines)
        for (int i = 0; i < oPattern1.length; i++) {
            System.out.println(
                    oPattern1[i] + "  " +
                    oPattern2[i] + "  " +
                    pPattern[i] + "  " +
                    sPattern[i]
            );
        }
    }
}
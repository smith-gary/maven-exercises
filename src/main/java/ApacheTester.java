import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ApacheTester {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter something: ");
        String userAns = sc.nextLine();

        System.out.printf("You entered \"%s\"\n", userAns);
//        Tells whether or not what the user entered is a number
        if (!StringUtils.isNumeric(userAns)) {
        System.out.printf("\"%s\" is not a number.\n", userAns);
        } else {
            System.out.printf("\"%s\" is a number.\n", userAns);
        }
//        Flips the case of the string
        System.out.printf("Flipped case: %s\n", StringUtils.swapCase(userAns));
//        Reverses the string
        System.out.printf("Reversed: %s", StringUtils.reverse(userAns));
    }
}

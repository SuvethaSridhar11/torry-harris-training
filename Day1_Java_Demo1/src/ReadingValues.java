import java.util.Scanner;

import static java.util.Scanner.*;

public class ReadingValues {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        number = scanner.nextInt();
        System.out.println("number is: "+number);
    }
}

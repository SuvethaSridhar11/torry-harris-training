import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.println(num);
                num++;
            }
            System.out.println();
        }

    }

}
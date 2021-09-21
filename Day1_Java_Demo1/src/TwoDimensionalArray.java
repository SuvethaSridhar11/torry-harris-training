import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        System.out.println("enter 2*2 matrix:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix are: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("principal matrix : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("sec diagonal matrix : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j == array.length - 1) {
                    System.out.print(array[i][j] + " ");
                    }
                }
            }
        }
    }


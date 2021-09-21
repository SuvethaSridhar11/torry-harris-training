import java.util.Scanner;

public class ReadDiffVariables {
    public static void main(String[] args) {
        byte b;
        int i;
        float f;
        Scanner scan = new Scanner(System.in);
        b = scan.nextByte();
        System.out.println("Byte is "+b);
        Scanner s = new Scanner(System.in);
        i = s.nextInt();
        System.out.println("Integer is "+i);
        Scanner n = new Scanner(System.in);
        f = n.nextFloat();
        System.out.println("Float is "+f);

    }
}

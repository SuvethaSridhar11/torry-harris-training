import java.util.Scanner;

public class ReadName {
    public static void main(String[] args) {
        String str;
        int n;
        System.out.println("enter name: ");
        Scanner scan = new Scanner(System.in);
        str = scan.next();
        System.out.println("enter num");
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        for(int i=0;i<n;i++)
        System.out.println("name is "+str);

    }
}

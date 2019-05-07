import java.util.Scanner;

public class Basic_A11 {
    public static void main(String args[]) {

        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number ");
        n = in.nextInt();
        int sum = n + Integer.valueOf(n+""+n) + Integer.valueOf(n+""+n+""+n);
        System.out.printf(n+"+"+n+n+"+"+n+n+n + " is " + sum);

    }
}
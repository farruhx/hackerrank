package codechallenge;

import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 9/23/17.
 */
public class Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}

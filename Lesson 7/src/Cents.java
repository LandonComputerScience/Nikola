import java.util.Scanner;

public class Cents {

    public static void main(String[] arg) {


        Scanner in = new Scanner(System.in);

        int rep = 1;

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        int washingtons = 0;
        int roosevelts = 0;
        int jeffersons = 0;
        int lincolns = 0;

        System.out.print("Amount of money in cents: ");
        int amount = in.nextInt();


        for (int i = 0; i * quarter <= amount; i++) {
            for (int j = 0; (j * dime) + (i * quarter) <= amount; j++) {
                for (int k = 0; (k * nickel) + (j * dime) + (i * quarter) <= amount; k++) {
                    washingtons = i;
                    roosevelts = j;
                    jeffersons = k;
                    lincolns = amount - (k * nickel) - (j * dime) - (i * quarter);

                    System.out.println("Solution #" + rep);
                    System.out.println("Quarters: " + washingtons + " Dimes: " + roosevelts + " Nickels: " + jeffersons + " Pennies: " + lincolns);
                    System.out.println();
                    rep++;
                }
            }
        }
    }
}
import java.util.Scanner;
import java.lang.Math;

public class MexPop {

    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);

        System.out.print("Population of Mexico: ");
        double population = in.nextInt();

        double oldPop = 123.8;
        int years = 0;

        while (oldPop * (Math.pow(1.005,years)) < population) {
            years = years + 1;
        }

        System.out.println("Years to reach " + (population) + " million people: " + (years));
    }

}

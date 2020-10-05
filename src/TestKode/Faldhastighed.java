package TestKode;
import java.util.Scanner;

public class Faldhastighed {

    public static void main(String[] args) {

        double g = 9.0665;

        Scanner scan = new Scanner(System.in);
        System.out.print("Indskriv højden for stenen: ");

        double h = scan.nextDouble();

        double t = Math.sqrt((2 * h) / g);
        double v = g * t;

        System.out.println("Faldtid uden luftmodstand: " + t);
        System.out.println("Sluthastighed uden luftmodstand: " + v);

        scan.close();

    }

}

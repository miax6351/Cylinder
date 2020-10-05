import java.util.Scanner;

public class Cylinder {

    public static void main(String[] args) {
        double r = 0;
        double h = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("radius:");
        r = s.nextDouble();
        System.out.println("højde:");
        h = s.nextDouble();

        System.out.println(volume(r, h));

    }

    public static double volume(double r, double h){
        return (Math.PI*Math.pow(r, 2)*h);
    }

}

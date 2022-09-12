
package trigger;
import java.util.Scanner;
public class Trigger {
    public static void main(String[] args) {

        System.out.println("Please input known values");
        Scanner input = new Scanner(System.in);

        System.out.println("Angle A");
        String Ain = input.next();

        System.out.println("Angle B");
        String Bin = input.next();

        System.out.println("Angle C");
        String Cin = input.next();

        System.out.println("Side A");
        String ain = input.next();

        System.out.println("Side B");
        String bin = input.next();

        System.out.println("Side C");
        String cin = input.next();

    }
}
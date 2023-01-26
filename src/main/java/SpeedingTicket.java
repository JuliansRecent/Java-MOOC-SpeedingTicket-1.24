
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.
        // Prompt the user to input a speed from the console
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        // If the given speed is over 120 print "Speeding ticket!"
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}

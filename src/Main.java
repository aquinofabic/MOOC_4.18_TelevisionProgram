import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> list = new ArrayList<>();

        while (true) {
            System.out.println("Name: ");
            String inputName = scanner.nextLine();
            if (inputName.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int inputDuration = scanner.nextInt();

            list.add(new TelevisionProgram(inputName, inputDuration));
            String inputAgain = scanner.nextLine();
            // The combination of .nextInt and .nextLine leaves a line break character in the keyboard buffer
            // adding another .nextLine results in an empty string that fulfils the keyboard buffer.
        }
        System.out.println("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();

        for (TelevisionProgram e : list) {
            if (maxDuration >= e.getDuration()) {
                System.out.println(e);
            }
        }
    }
}

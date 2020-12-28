import java.util.Scanner;

public class Marks {
    public static void numMarkToTextMark() throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark");
        int num = scanner.nextInt();

        switch (num) {
            case 9, 10 -> System.out.println("Well");
            case 7, 8 -> System.out.println("Good");
            case 6 -> System.out.println("Acceptable");
            case 5 -> System.out.println("Bad");
            case 1, 2, 3, 4 -> System.out.println("Very Bad");
            default -> throw new IllegalAccessException("No such assessment exists");
        }
    }
}

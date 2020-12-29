import java.util.Scanner;

public class Marks {
    public static void numMarkToTextMark() throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark");
        int num = scanner.nextInt();
        String textMark = switch (num) {
            case 9, 10 -> "Well";
            case 7, 8 -> "Good";
            case 6 -> "Acceptable";
            case 5 -> "Bad";
            case 1, 2, 3, 4 -> "Very Bad";
            default -> throw new IllegalAccessException("No such assessment exists");
        };
        System.out.println(textMark);
    }
}

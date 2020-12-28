import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TeeingCollectors {
    public static void percentageCalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number set");
        String lineOfNum = scanner.nextLine();
        String[] arr = lineOfNum.split(",");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        Object result = list.stream().collect(Collectors.teeing(Collectors.counting(),
                (Collectors.toSet()), (allSum, set) -> (set.size() * 100) / allSum));
        System.out.println(result + "%");
    }
}

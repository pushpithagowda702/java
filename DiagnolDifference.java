import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int dia1 = 0;
        int dia2 = 0;
        for (int row = 0; row < arr.size(); row++) {
            for (int col = 0; col < arr.get(row).size(); col++) {
                if (row == col) {
                    dia1 += arr.get(row).get(col);
                }

                if (row == arr.size() - 1 - col) {
                    dia2 += arr.get(row).get(col);
                }
            }
        }
        return Math.abs(dia1 - dia2);
    }
}

public class DiagnolDifference {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline left by nextInt()

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(
                Stream.of(sc.nextLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList())
            );
        }

        int result = Result.diagonalDifference(arr);

        System.out.println(String.valueOf(result));

        sc.close(); // Close the Scanner
    }
}

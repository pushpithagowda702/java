import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        int max = Integer.MIN_VALUE;
      
        for(int i = 0; i < candles.size(); i++) {
            if(max < candles.get(i)) {
                max = candles.get(i);
            }
        }
      
        for(int i = 0; i < candles.size(); i++) {
            if(max == candles.get(i)) {
                count++;
            }
        }
        return count;
    }
}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

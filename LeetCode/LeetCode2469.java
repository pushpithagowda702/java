public class LeetCode2469 {
  class Solution {
    public double[] convertTemperature(double celsius) {
        double[] temp = new double[2];
        temp[0] = (celsius + 273.15)*1e5/1e5;
        temp[1] = (celsius * 1.80 + 32.0)*1e5/1e5;
        
        return temp;
    }
}
}

import java.util.ArrayList;
import java.util.List;

public class LeetCode2951 {
  class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        
        List<Integer> sol = new ArrayList<>();
        
        for(int i=1; i<mountain.length-1; i++) {
            if(mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]) {
                sol.add(i);
            }
        }
        return sol;
    }
}
}

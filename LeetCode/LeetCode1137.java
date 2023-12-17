class Solution {
    public int tribonacci(int n) {
        
        if(n==0) {
            return 0;
        }
        
        int a = 0;
        int b = 1;
        int c = 1;
        
        for(int i=2; i<n; i++) {
            int tmp = a;
            a = b;
            b = c;
            c = c + a + tmp;
        }
        return c;
    }
}
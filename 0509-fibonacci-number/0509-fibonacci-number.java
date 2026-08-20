class Solution {
    public int fib(int n) {
        int F1 = 0;
        int F2 = 1;
        
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            for (int i = 2; i<=n; i++){
                int temp = F1 + F2;
                F1 = F2;
                F2 = temp;
            }
                return F2;
        }

    }
}
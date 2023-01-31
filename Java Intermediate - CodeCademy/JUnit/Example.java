public class Example {
    public int isPositive(int n) {
        if (n > 0) {
            return 1;
        } else if( n == 0){
            return -1;
        }
        return 0;
    }

    public int factorial(int n){
        int result = 1;
        for (int i = n; i > 0; i--){
            result *= i;
        }
        return result;
    }


}

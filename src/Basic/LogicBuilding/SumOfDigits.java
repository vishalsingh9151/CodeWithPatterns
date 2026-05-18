package Basic.LogicBuilding;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = functionName(567);
        System.out.println(ans);
    }
    public static int functionName(int n){
        if(n == 0){
            return 0;
        }
        int sum =0;
        while(n > 0){
            int extract = n % 10;
            // last digit extract
            // 567 % 10 = 7

            sum = sum + extract;
            // sum builds
            // 0 + 7 = 7
            // 7 + 6 = 13
            // 13 + 5 = 18

            n = n / 10;
            // remove last digit
            // 567 / 10 = 56
        }
        return sum;
    }
}

/*
WHAT ?
This program finds sum of digits.
Example:
567 -> 18

APPROACH
1. Extract last digit
2. Add into sum
3. Remove last digit
4. Repeat until n becomes 0

WHY if(n == 0) ?
Because sum of 0 is 0.

CORE CONCEPTS USED
1. Modulo %
2. Integer Division /
3. Loop
4. Digit Extraction

HOW extract works?
n % 10
Example:
567 % 10 = 7

HOW remove works?
n / 10
Example:
567 / 10 = 56

TIME COMPLEXITY
O(log10 n)
Because every loop removes one digit.

SPACE COMPLEXITY
O(1)
*/

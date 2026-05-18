package Basic.LogicBuilding;

public class PalindromeNumbers {
    public static void main(String[] args) {
        boolean ans = functionName(123321);
        System.out.println(ans);
    }
    public static boolean functionName(int n){
        int orignal = n;
        // original number store
        // because n changes later
        if(n == 0){
            return true;
        }
        int rev = 0;
        while(n > 0){
            int temp = n % 10;
            // extract last digit
            // 123 % 10 = 3
            rev = rev * 10 + temp;
            // reverse builds
            // 3 -> 32 -> 321
            n = n / 10;
            // remove last digit
            // 123 / 10 = 12
        }
        if(rev == orignal){
            // palindrome means
            // reverse == original
            return true;
        }
        else {
            return false;
        }
    }
}
/*
WHAT ?

Palindrome number reads same
from front and back.

Example:
121
12321
1331
NOT PALINDROME
123
456

APPROACH
1. Store original number
2. Reverse number
3. Compare reverse with original
4. Same -> palindrome
5. Different -> not palindrome

WHY original variable?
Because n changes during loop.
Example:
123 -> 12 -> 1 -> 0
Original number would be lost.

WHY if(n == 0) ?
0 is palindrome itself.

CORE CONCEPTS USED
1. Modulo %
2. Integer Division /
3. Reverse Number Logic
4. Comparison

HOW reverse builds?
rev = rev * 10 + temp
Example:
temp = 3
rev = 3

temp = 2
rev = 32

temp = 1
rev = 321

TIME COMPLEXITY
O(log10 n)
Because every loop removes one digit.

SPACE COMPLEXITY
O(1)
*/
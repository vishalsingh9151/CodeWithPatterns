package Basic.LogicBuilding;

public class ReverseNumber {
    public static void main(String[] args) {
        int ans = functionName(3101);
        System.out.println(ans);
    }
    public static int functionName(int n ){
        if(n ==0 ){
            return 0;
        }
        int rev = 0;
        while(n > 0){
            int temp = n % 10;
            rev = rev * 10 + temp;         //  rev(0) * 10 + extract Number = extractNumber
            n = n/10;
        }
        return rev;
    }
}

/*
WHAT ?
This program reverses a number.

Example:
1234 -> 4321
509 -> 905

APPROACH
1. Extract last digit
2. Add digit into reverse number
3. Remove last digit
4. Repeat until number becomes 0

CORE CONCEPTS USED

1. Modulo (%)
2. Integer Division (/)
3. Loop Traversal
4. Number Building

HOW reverse builds?
reverse = reverse * 10 + digit

Example:

reverse = 0

digit = 4
reverse = 4

digit = 3
reverse = 43

digit = 2
reverse = 432


TIME COMPLEXITY: O(log10 n)
WHY?
Because every iteration removes one digit.

SPACE COMPLEXITY: O(1)
No extra space used.


/*
LEARNING

- Learned modulo operator
- Learned integer division
- Learned digit extraction
- Learned reverse number building
- Base concept for palindrome problems
*/
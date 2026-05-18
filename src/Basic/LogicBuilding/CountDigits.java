package Basic.LogicBuilding;

public class CountDigits {
    public static void main(String[] args) {
        long ans = functionName(123456789);   // 12345678910 used -> Long = 12345678910L
        System.out.println(ans);                  // not used 0123.. leading ZERO
                                                            // its OCTAL NUmber
    }
    public static long functionName(long n ){
        if(n == 0){
            return 1;
        }
        int count = 0;
        while(n > 0){
            n = n/10;
            count++;
        }
        return count;
    }
}
/*
-------------------------------------------------------
Problem: Count Digits
Topic: Basics, Loops, Mathematics
Difficulty: Easy

-------------------------------------------------------

Problem Statement:
Count the total number of digits present
in a given number.

-------------------------------------------------------

Example 1:
Input:
12345

Output:
5

-------------------------------------------------------

Example 2:
Input:
98

Output:
2

-------------------------------------------------------

What is happening internally?

12345

Step 1:
12345 / 10 = 1234

Step 2:
1234 / 10 = 123

Step 3:
123 / 10 = 12

Step 4:
12 / 10 = 1

Step 5:
1 / 10 = 0

Loop runs 5 times
So total digits = 5

-------------------------------------------------------

Why division by 10?

Because integer division removes
last digit automatically.

Example:

567 / 10 = 56

-------------------------------------------------------

Approach:
1. Take counter variable
2. Run loop until number becomes 0
3. Divide number by 10
4. Increase counter
5. Return count

-------------------------------------------------------

Time Complexity: O(log10 n)

Why?
Because number reduces by factor of 10.

-------------------------------------------------------

Space Complexity: O(1)

-------------------------------------------------------

Learning:
- Learned digit traversal
- Learned integer division
- Learned loop-based number processing
- Base concept for many DSA problems

-------------------------------------------------------
*/


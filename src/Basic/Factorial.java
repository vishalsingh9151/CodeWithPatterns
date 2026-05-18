package Basic;
/*
-------------------------------------------------------
Problem: Factorial of a Number
Topic: Basics, Loops, Mathematics
Difficulty: Easy

Problem Statement:
Find the factorial of a given number.

Factorial means:
n! = n × (n-1) × (n-2) × ... × 1

Example:
5! = 5 × 4 × 3 × 2 × 1
   = 120

-------------------------------------------------------

Example 1:
Input:
5

Output:
120

-------------------------------------------------------

Example 2:
Input:
0

Output:
1

Explanation:
0! = 1

-------------------------------------------------------

Approach 1: Iterative Approach
1. Take a variable fact = 1
2. Run loop from 1 to n
3. Multiply fact with each number
4. Return fact

Time Complexity: O(n)
Space Complexity: O(1)

-------------------------------------------------------

Approach 2: Recursive Approach
1. factorial(n) = n * factorial(n - 1)
2. Base condition:
   factorial(0) = 1
   factorial(1) = 1

Time Complexity: O(n)
Space Complexity: O(n)
(Because recursive calls use stack memory)

-------------------------------------------------------

Learning:
- Learned factorial concept
- Learned loop multiplication
- Learned recursion basics
- Learned base condition importance

-------------------------------------------------------
*/

public class Factorial {

    // Iterative Approach
    static int iterativeFactorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Recursive Approach
    static int recursiveFactorial(int n) {
        // Base Condition
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        // Iterative Answer
        int iterativeAns = iterativeFactorial(n);
        System.out.println("Iterative Factorial:");
        System.out.println(iterativeAns);
        // Recursive Answer
        int recursiveAns = recursiveFactorial(n);
        System.out.println("Recursive Factorial:");
        System.out.println(recursiveAns);
    }
}

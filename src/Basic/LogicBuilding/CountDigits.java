package Basic.LogicBuilding;

public class CountDigits {
    public static void main(String[] args) {
        long ans = functionName(123456789);   // 12345678910 used -> Long = 12345678910L
        System.out.println(ans);                  // not used 0123.. leading ZERO
                                                    // its OCTAL NUmber
                                        // if Negative -> Math.abs(-1233); built-in function / TypeCaste -(-123)
    }
    public static long functionName(long n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}

/*
WHAT ?
This program counts how many digits are present in a number.

Example:
12345 -> 5 digits
*/



/*
WHY use long here?

int range:
-2,147,483,648 to 2,147,483,647

Bigger numbers need long.
*/



/*
WHY "L" at end?

Java thinks numbers are int by default.

Adding L means:
"This number is long type"
*/



/*
public  -> method usable everywhere
static  -> can call directly without object
long    -> function returns long value
functionName -> method name
(long n) -> takes one long input
*/



/*
WHY if(n == 0) ?

Because:
0 itself has 1 digit.
*/



/*
WHY count = 0 ?

Initially no digits counted.
*/



/*
WHY while(n > 0) ?

Loop runs until number becomes 0.

Example:
1234
123
12
1
0 -> stop
*/



/*
HOW digit removed?

Divide by 10 removes last digit.

Example:
1234 / 10 = 123
123 / 10 = 12
*/



/*
WHY count++ inside loop?

Every loop removes ONE digit.
So every loop counts ONE digit.

count++ means:
count = count + 1
*/

/*
WHY not count++ outside loop?

Because outside loop it runs only once.

Example:
12345 has 5 digits.

Loop runs 5 times.
So count must increase 5 times.
*/

/*
WHY return count?

Final answer stored in count variable.

return sends answer back to main method.
*/

/*
TYPES OF RETURN:

return count;
-> returns variable value

return 0;
-> specifically returns 0

return;
-> returns nothing
-> only used in void functions
*/
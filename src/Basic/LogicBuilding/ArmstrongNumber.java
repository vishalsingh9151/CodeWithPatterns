package Basic.LogicBuilding;

public class ArmstrongNumber {
    public static void main(String[] args) {
        boolean ans = armstrongN0(9474);
        System.out.println(ans);
    }

    static int functionName(int n){
        if(n == 0){
            return 1;
        }

        int count = 0;

        while(n > 0){

            n = n / 10;

            count++;
        }

        return count;
    }

    static boolean armstrongN0(int n){

        int original = n;

        // original number store
        // because n changes later

        int count = functionName(n);

        // count stores total digits
        // 153 -> 3
        // 9474 -> 4

        int armsNumber = 0;

        while(n > 0){

            int rem = n % 10;

            // extract last digit
            // 9474 % 10 = 4

            armsNumber += (int)Math.pow(rem , count);

            // rem^count adds into armstrong number

            n = n / 10;

            // remove last digit
            // 9474 / 10 = 947
        }

        if(original == armsNumber){

            // same means armstrong number

            return true;
        }
        else {

            return false;
        }
    }
}

/*
WHAT ?

Armstrong number means:
sum of digits power total digits
equals original number.

Example:
153

1^3 + 5^3 + 3^3
= 153

Example:
9474

9^4 + 4^4 + 7^4 + 4^4
= 9474

NOT ARMSTRONG
123
567

APPROACH
1. Count total digits
2. Extract last digit
3. Find digit^count
4. Add into armstrong number
5. Remove last digit
6. Compare with original number

WHY original variable?
Because n changes during loop.

9474 -> 947 -> 94 -> 9 -> 0

Original number would be lost.

WHY count used?
Because digits can vary.

153 -> 3 digits
9474 -> 4 digits
54748 -> 5 digits

Power depends on total digits.

CORE CONCEPTS USED
1. Modulo %
2. Integer Division /
3. Math.pow()
4. Digit Count
5. Comparison

HOW extract works?
rem = n % 10

Example:
9474 % 10 = 4

HOW remove works?
n = n / 10

Example:
9474 / 10 = 947

WHY (int)Math.pow ?
Math.pow returns double.

armsNumber is int.

So convert double -> int.

TIME COMPLEXITY
O(log10 n)

Because every loop removes one digit.

SPACE COMPLEXITY
O(1)
*/
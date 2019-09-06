import java.util.Scanner;

public class Q1 {
    public static void isAPalindrome(int checkNum) {
        int s = 0, tempvar = checkNum, var, sum = 0;
        while (tempvar > 0) {
            var = tempvar % 10;
            if (var % 2 == 0) {
                sum += var;
            }
            tempvar = tempvar / 10;
            s = s * 10 + var;
        }
        if (s == checkNum) {
            System.out.printf("%d is a palindrome\n", checkNum);
            if (sum > 25) {
                System.out.println("Sum of even digits is greater than 25");
            } else {
                System.out.println("Sum of even digits is less than 25");

            }

        }
        else{
            System.out.printf("%d is not a palindrome\n", checkNum);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int checkNum = sc.nextInt();
        Q1.isAPalindrome(checkNum);
    }
}
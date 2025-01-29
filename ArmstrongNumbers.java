import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + ":");
        printArmstrongNumbers(lowerBound, upperBound);

        scanner.close();
    }

    public static void printArmstrongNumbers(int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int temp = num;
        int sum = 0;
        int digitCount = countDigits(num);

        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digitCount);
            temp /= 10;
        }

        return sum == num;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}



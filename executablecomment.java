public class executablecomment {
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
    public static void printFibonacciSeries(int limit) {
        int num1 = 0;
        int num2 = 1;
        int count = 0;

        System.out.println("Fibonacci Series up to " + limit + ":");
        System.out.print(num1 + " " + num2);

        while (count < limit - 2) {
            int num3 = num1 + num2;
            System.out.print(" " + num3);

            num1 = num2;
            num2 = num3;
            count++;
        }

        System.out.println();
    }


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + calculateFactorial(5));

        System.out.println();
        printFibonacciSeries(10);

        System.out.println();
        System.out.println("Is 17 prime? " + isPrime(17));
    }

}
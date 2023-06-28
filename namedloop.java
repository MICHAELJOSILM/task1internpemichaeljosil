public class namedloop {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);

            innerLoop:
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner loop iteration: " + j);

                if (i == 2 && j == 2) {
                    break outerLoop;
                }
            }
        }

        System.out.println("Loop finished");
    }
}
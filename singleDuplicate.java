import java.util.HashSet;
import java.util.Scanner;

public class singleDuplicate {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> visited = new HashSet<>();

        for (int num : nums) {
            if (visited.contains(num)) {
                return num; // Found the duplicate
            }
            visited.add(num);
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        int duplicate = findDuplicate(nums);

        if (duplicate != -1) {
            System.out.println("Duplicate found: " + duplicate);
        } else {
            System.out.println("No duplicates found.");
        }

        scanner.close();
    }
}
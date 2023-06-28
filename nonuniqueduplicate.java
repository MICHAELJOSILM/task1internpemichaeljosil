import java.util.HashMap;
import java.util.Scanner;

public class nonuniqueduplicate {
    public static Integer findNonUniqueDuplicate(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();


        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        for (int num : nums) {
            if (frequencyMap.get(num) > 1) {
                return num;
            }
        }

        return null;
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

        Integer nonUniqueDuplicate = findNonUniqueDuplicate(nums);

        if (nonUniqueDuplicate != null) {
            System.out.println("Non-unique duplicate found: " + nonUniqueDuplicate);
        } else {
            System.out.println("No non-unique duplicates found.");
        }

        scanner.close();
    }
}
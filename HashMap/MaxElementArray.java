import java.util.*;

public class MaxElementArray {

    static int getMostFrequentElement(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxElement = arr[0], maxCount = 0;

        // Count frequency of each element
        for (int num : arr) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);

            // Update max element if this one has higher frequency
            if (count > maxCount) {
                maxElement = num;
                maxCount = count;
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Most frequent element: " + getMostFrequentElement(arr));

        sc.close();
    }
}

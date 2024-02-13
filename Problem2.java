import java.util.*;

public class Problem2 {
    public static void main(String[] args) {

        int arr1[] = new int[] {2, 2, 2, 2, 2};
        System.out.println("Array 1 Before Removing Duplicates: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Array After Removing Duplicates: ");
        System.out.println(Arrays.toString(removeDuplicates(arr1)));

        int arr2[] = new int[] { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        System.out.println("Array 2 Before Removing Duplicates: ");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Array After Removing Duplicates: ");
        System.out.println(Arrays.toString(removeDuplicates(arr2)));
    /*
     *  Array 1 Before Removing Duplicates: 
        [2, 2, 2, 2, 2]
        Array After Removing Duplicates: 
        [2]
        Array 2 Before Removing Duplicates: 
        [1, 2, 2, 3, 4, 4, 4, 5, 5]
        Array After Removing Duplicates: 
        [1, 2, 3, 4, 5]
     */

    }

    public static int[] removeDuplicates(int[] arr) {

        int maxVal = arr[arr.length - 1];

        int frequencyArray[] = new int[maxVal + 1];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (frequencyArray[arr[i]] == 0) {
                count++;
                frequencyArray[arr[i]]++;
            }
        }

        int sortedArray[] = new int[count];
        int count1 = 0;

        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] == 1) {
                sortedArray[count1] = i;
                count1++;
            }
        }
        return sortedArray;

    }
}

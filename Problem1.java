
import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] array01 = { 1, 3, 5, 7 };
        int[] array02 = { 2, 4, 6, 8 };
        int[] array03 = { 0, 9, 10, 11 };

        int[] mergedArray = mergeSortedArrays(array01, array02, array03);
        System.out.println(Arrays.toString(mergedArray));


        int[] array11 = {1,3,7};
        int[] array12 = {2,4,8};
        int[] array13 = {9,10,11};

        mergedArray = mergeSortedArrays(array11, array12, array13);

        System.out.println(Arrays.toString(mergedArray));

        /*Output:
         * [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
         * [1, 2, 3, 4, 7, 8, 9, 10, 11]
         */
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2, int[] array3) {

        int[] array = new int[array1.length + array2.length + array3.length];

        int i = 0, j = 0, k = 0;
        int index = 0;

        while (i < array1.length && j < array2.length && k < array3.length) {

            if (array1[i] <= array2[j] && array1[i] <= array3[k]) {
                array[index] = array1[i];
                i++;
            } else if (array2[j] <= array1[i] && array2[j] <= array3[k]) {
                array[index] = array2[j];
                j++;
            } else {
                array[index] = array3[k];
                k++;
            }
            index++;
        }

        while (i < array1.length) {
            array[index] = array1[i];
            index++; i++;
        }

        while (j < array2.length) {
            array[index] = array2[j];
            index++; j++;
        }

        while (k < array3.length) {
            array[index] = array3[k];
            index++; k++;
        }

        return array;
    }
}

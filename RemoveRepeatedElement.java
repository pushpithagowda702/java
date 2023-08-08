import java.util.Arrays;

public class RemoveRepeatedElement {
    public static void main(String[] args) {
        int[] array = { 4, 2, 1, 3, 4, 2, 3, 1 };
        int res = removeDuplicates(array);
        
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array with duplicates removed: " + Arrays.toString(Arrays.copyOf(array, res)));
    }

    public static int removeDuplicates(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return array.length;
        }

        int newSize = 1;

        for (int i = 1; i < array.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < newSize; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                array[newSize] = array[i];
                newSize++;
            }
        }

        return newSize;
    }
}

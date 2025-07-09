package section1_2;

public class MyArray {
    public int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public double findAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
    public int[] reverse(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        int[] sampleArray = {1, 2, 3, 4, 5};

        System.out.println("Max: " + myArray.findMax(sampleArray));
        System.out.println("Min: " + myArray.findMin(sampleArray));
        System.out.println("Average: " + myArray.findAverage(sampleArray));

        int[] reversedArray = myArray.reverse(sampleArray);
        System.out.print("Reversed: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class A4_QuickSort {

    // Function to partion the array on the basis of the pivot value;

    static int partition(int[] array, int low, int high) {

        int pivot = array[low];
        int start = low;
        int temp;

        while (low < high) {
            while (low <= high && array[low] <= pivot)
                low++;
            while (high >= low && array[high] > pivot)
                high--;
            //System.out.println("Low: " + low + "  High: " + high);

            if (low < high) {
                temp = array[low];
                array[low] = array[high];
                array[high] = temp;
            }
        }
        temp = array[start];
        array[start] = array[high];
        array[high] = temp;

        return high;
    }

    // Function to implement quick sort

    static void quickSort(int[] array, int low, int high) {

        if (low < high) {

            int loc = partition(array, low, high);

            
            quickSort(array, low, loc - 1);
            //System.out.println(Arrays.toString(array));
           
            quickSort(array, loc + 1, high);
            //System.out.println(Arrays.toString(array));
            

        }

    }

    // Function to read user input

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int size;

            System.out.print("Enter the size of the array:");

            size = Integer.parseInt(sc.nextLine());

            int[] array = new int[size];

            System.out.println("Enter array elements");

            int i;

            for (i = 0; i < array.length; i++) {

                array[i] = Integer.parseInt(sc.nextLine());

            }

            System.out.println("The initial array is");

            System.out.println(Arrays.toString(array));

            quickSort(array, 0, array.length - 1);

            System.out.println("The sorted array is");

            System.out.println(Arrays.toString(array));

            sc.close();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

}

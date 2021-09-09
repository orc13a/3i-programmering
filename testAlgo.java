import java.util.Random;
// import java.util.Arrays;

public class testAlgo {
    public static InsertonSort myAlgo;

    public static void main(String[] args) {
        int lengthOfArray     = Integer.parseInt(args[0]);
        int numberOfArrays  = Integer.parseInt(args[1]);

        myAlgo = new InsertonSort();

        System.out.println("\n");

        for (int i = 0; i < numberOfArrays; i++) {
            int[] newArr = createArray(lengthOfArray);
            long tested = test(newArr);
            // System.out.println("\nArray " + (i + 1) + ": " + tested + " ns");
            System.out.println(tested);
        }

        System.out.println("\n");
    }

    public static int[] createArray(int arrLength) {
        int[] arr = new int[arrLength];
        Random random = new Random();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(arrLength) + 1;
        }

        return arr;
    }

    public static long test(int[] arr) {
        long start = System.nanoTime();
        myAlgo.sort(arr);
        long end = System.nanoTime();

        long time = end - start;

        return time;
    }
}

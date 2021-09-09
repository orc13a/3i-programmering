import java.util.Random;
import java.util.Arrays;

public class AlgoritmeAnalyse {
    public static InsertonSort myAlgo;
    public static void main(String[] args) {
        //myAlgo = new InsertonSort();

        int lengthArray     = Integer.parseInt(args[0]);
        int numberOfArrays  = Integer.parseInt(args[1]);
        // System.out.println(lengthArray + " " + numberOfArrays);

        for(int j=0; j < numberOfArrays; j++) {
            int[] list = AlgoritmeAnalyse.generateRandomArray(lengthArray);
            printArray(list);
            //System.out.println("\nSorteringstid: " + beregnSorteringsTid(list) + " ms");
            //sort og tag tid
        }
        System.out.println("\n");
    }

    public static int[] generateRandomArray(int lengthArray) {
        int[] liste = new int[lengthArray];
        Random random = new Random();

        for(int i =0; i < lengthArray; i++) {
            liste[i] = random.nextInt(lengthArray) + 1;
        }

        return liste;
    }

    public static void printArray(int[] list) {
        System.out.print("\nRandom array:\n[");
        for(int i = 0; i < list.length; i++) {
            if (i == list.length - 1) {
                System.out.print(i + "]");
            } else {
                System.out.print(i + ", ");
            }
        }
    }

    public static long beregnSorteringsTid(int[] list) {
        long start = System.currentTimeMillis();
        //myAlgo.sort(list);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        return timeElapsed;
    }

    public static void sorteringAfTal(int[] list) {
        Arrays.sort(list);
    }
}

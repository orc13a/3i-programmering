import java.util.Random;

public class Main {
    public static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int[] pickedIndexs = new int[10]; // Holder de indexer som er blevet valgt
    public static int[] ranArr = new int[10];

    public static int indexsPicked = 0;

    public static void main(String[] args) {
        printArr();
        printRandomArr();
    }

    // Printer vores array "arr" ud på en linje i rækkefølge
    public static void printArr() {
        System.out.print("\n"); // Laver en tom line
        System.out.print("Array 'arr' i rækkefølge:");
        System.out.print("\n");
        // For hvert tal i vores array "arr" printer vi talet med et mellemrum
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("\n\n");
    }

    public static void printRandomArr() {
        Random ran = new Random();
        int ranIndex = ran.nextInt(10);

        while (indexsPicked < 10) {
            // ranIndex = ran.nextInt(10);
            // System.out.println(arrIncludes(pickedIndexs, ranIndex));
            if (arrIncludes(pickedIndexs, ranIndex) == true) {
                ranIndex = ran.nextInt(10);
            } else {
            // if (!arrIncludes(pickedIndexs, ranIndex)) {
                ranArr[ranIndex] = arr[ranIndex];
                pickedIndexs[indexsPicked] = ranIndex;
                // indexsPicked++;
            }
            indexsPicked++;
        }

        System.out.print("\n"); // Laver en tom line
        System.out.print("Array 'ranArr':");
        System.out.print("\n");
        // For hvert tal i vores array "ranArr" printer vi talet med et mellemrum
        for (int num : ranArr) {
            System.out.print(num + " ");
        }
        System.out.print("\n\n");
    }

    public static boolean arrIncludes(int[] theArr, int targetValue) {
        for (int num : theArr) {
            System.out.println(num);
            System.out.println(targetValue);
            System.out.println("\n");
            if(num == targetValue) {
                return true;
            }
        }
        return false;
    }
}
public class BinarySearch {
    public static void main(String[] args) {
        
    }

    public static String search(int[] array, int targetNum) {
        int resultIndex = -1;
        int arrayHalf = array.length / 2;
        int leftRange = 0;
        int rightRange = array.length - 1;
        int endlessLoop = 0;

        while (endlessLoop != 5 && resultIndex == -1) {
            if (array[arrayHalf] == targetNum) {
                resultIndex = arrayHalf;
                break;
            } else {
                if (array[arrayHalf] < targetNum) {
                    leftRange = arrayHalf;
                } else {
                    rightRange = arrayHalf;
                }
            }
            arrayHalf = (leftRange + rightRange) / 2;

            if (leftRange == 0 && rightRange == 0) {
                endlessLoop++;
            }
        }

        if (resultIndex > -1) {
            return "\n=> Tallet: " + targetNum + " blev fundet på index: " + resultIndex + ".\n";
        } else {
            return "\n=> Tallet: " + targetNum + " blev findes ikke i denne array.\n";
        }
    }
}

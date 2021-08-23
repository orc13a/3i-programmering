public class BinarySearch {
    public static void main(String[] args) {
        
    }

    // Søge metoden
    public static String search(int[] array, int targetNum) {
        int resultIndex = -1; // Det tal vi leder efters index
        int arrayHalf = array.length / 2; // Halvdelen af den den af arrayen vi kigger i
        int leftRange = 0; // Minimum hvor vi kigger i arrayen
        int rightRange = array.length - 1; // Maksimum hvor vi kigger i arrayen
        int endlessLoop = 0; // Check for om vi har kigget hele arrayen igennem

        // Vi kigger i arrayen så længe vi ikke har fået tallet og
        // vi ikke har kigget arrayen igennem
        while (endlessLoop != 5 && resultIndex == -1) {
            if (array[arrayHalf] == targetNum) { // Tjekker om vi har fundet tallet
                resultIndex = arrayHalf;
                break;
            } else { // Ellers gør vi hvor vi kigger i arrayen mindre
                // Er midten af arrays plads tal mindre end talet vi leder efter
                if (array[arrayHalf] < targetNum) {
                    leftRange = arrayHalf; // Så rykker vi minium til midten af arrayen til den tidligere midt.
                } else {
                    rightRange = arrayHalf; // Så rykker vi maksimum til midten af arrayen til den tidligere midt.
                }
            }
            arrayHalf = (leftRange + rightRange) / 2; // Udregner den midtte

            // Er minimum og maksimum begge 0?
            if (leftRange == 0 && rightRange == 0) {
                // Når "endlessLoop" er 5 betyder det at vi har kigget arrayen igennem og tallet er ikke blevet fundet
                // "endlessLoop" behøver ikke at være 5, kan sagtens være 1.
                endlessLoop++;
            }
        }

        // Når looped er færdig kigger vi på om vi fandt tallet.
        if (resultIndex > -1) {
            // "\n" betyder: ny linje i terminalen
            return "\n=> Tallet: " + targetNum + " blev fundet på index: " + resultIndex + ".\n";
        } else {
            return "\n=> Tallet: " + targetNum + " findes ikke i denne array.\n";
        }
    }
}

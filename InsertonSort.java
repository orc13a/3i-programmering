public class InsertonSort {
    public static void main(String[] args) {
        // https://www.random.org/integer-sets/
        // int[] talArr = {14, 18, 21, 33, 3, 38, 16, 34, 8, 19, 4, 29, 2, 15, 10, 24, 11, 31, 25, 6, 30, 41, 49, 13, 40, 36, 27, 44, 42, 17, 22, 47, 5, 48, 50, 45, 23, 39, 26, 7, 46, 1, 9, 37, 28, 20, 43, 35, 32, 12};

        // System.out.println(sort(talArr));
    }

    public static String sort(int[] array) {
        // Start tid for algoritmen starter
        // long algoStart = System.nanoTime();

        String result = "["; // Den sorteret array
        // Long algoTime; // Til at få den totale tid
        int index = 1; // Det index vi kigger på

        while (index != array.length) {
            // Hvis vi er kommet til starten af arrayen
            if (index == 0) {
                index++;
            }

            int matchIndex = index -1; // Pladsen en mod venstre

            int getValue = array[index]; // Den plads vi kigger på
            int matchValue = array[matchIndex]; // Den plads vi sammenligner med
            int saved = 0; // Gemmer en af værdierne

            // Hvis værdien en mod venstre er større end den plads vi kigger på
            if (getValue < matchValue) {
                saved = matchValue; // Gem den større værdi
                array[matchIndex] = getValue; // Set pladsen mod venstre til den lave værdi
                array[index] = saved; // Set pladsen vi kigger på den til høje værdi

                index--; // Går en mod venstre i arrayen og sammenlign igen
            } else {
                index++; // Ikke mindre, gå en mod højre
            }

        }
        // Start tid for algoritmen slutter
        // long algoEnd = System.nanoTime();
        // algoTime = algoEnd - algoStart; // Udregn tiden

        // Lav result stringen med arrayen
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                result += array[i] + "]";
            } else {
                result += array[i] + ", ";
            }
        };
        
        // return result + "\n\n> It took: " + String.valueOf(algoTime) + " ns " + (algoTime * 0.0000000001) + " s";
        return result;
    }
}
// Opgave --------------------
// 1) Lav et sorteret tal-array på n-tal.
// 2) Lad computeren søge efger et valgt tal vha. binary-søgning
// ----------------------------------------
// import java.util.Random; 

public class Main {
    public static void main(String[] args) {
        // Den sorteret array
        int[] numArr = {22, 27, 66, 70, 80, 92, 119, 122, 142, 198, 202, 210, 248, 272, 274, 316, 335, 357, 361, 391, 404, 408, 414, 429, 433, 447, 484, 555, 560, 579, 580, 625, 640, 642, 670, 683, 712, 754, 772, 788, 836, 861, 873, 909, 920, 939, 949, 960, 981, 991};
        int targetNum = 836; // Det tal vi leder efter

        // Laver et ny objekt af vores klasse "BinarySearch"
        BinarySearch binarySearch = new BinarySearch();
        // Gemmer resultat fra vores søgning i en variable
        String searchResult = binarySearch.search(numArr, targetNum); 

        // Skriver resultatet ud i terminalen.
        System.out.println(searchResult);
    }
}

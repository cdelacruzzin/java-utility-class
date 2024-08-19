package lab6;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getMultiplesOf3(int[] numbers) {

        int[] multiples = new int[0];
        for (int number : numbers) {
            for (int j = 3; j <= number; j *= 2) {
                if (j == number) {
                    multiples = addToArray(j, multiples);
                }
            }
        }
        return multiples; // You need to replace this line by returning the proper result.
    }




    public static String[] getAllPrefixes(int[] numbers) {

        String[] result = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = "[";
            for (int j = 0; j <= i ; j++) {
                if (j == 0) {
                    result[i] += String.format("%d", numbers[j]);
                } else {
                    result[i] += String.format(", %d", numbers[j]);
                }
            }
            result[i] += "]";
        }
        return result; // You need to replace this line by returning the proper result.
    }


    public static int[] getGroupedNumbers(int[] numbers) {
        int[] result = new int[numbers.length];
        StringBuilder gp1 = new StringBuilder();
        StringBuilder gp2 = new StringBuilder();
        StringBuilder gp3 = new StringBuilder();
        for (int number : numbers) {
            if (number % 3 == 0) {
                gp1.append(number); // instead of string concatenation (+=), use .append()
            } else if (number % 3 == 1) {
                gp2.append(number);
            } else if (number % 3 == 2) {
                gp3.append(number);
            }
        }
        String[] gp1Int = gp1.toString().split("");
        String[] gp2Int = gp2.toString().split("");
        String[] gp3Int = gp3.toString().split("");

        if (!gp1Int[0].isEmpty()) {
            for (int i = 0; i < gp1Int.length; i++) {
                result[i] = Integer.parseInt(gp1Int[Integer.parseInt(String.valueOf(i))]);
            }
        } else {
            gp1Int = new String[0];
        }
        if (!gp2Int[0].isEmpty()) {
            for (int i = 0; i < gp2Int.length; i++) {
                result[gp1Int.length  + i] = Integer.parseInt(gp2Int[i]);
            }
        } else {
            gp2Int = new String[0];
        }
        if (!gp3Int[0].isEmpty()) {
            for (int i = 0; i < gp3Int.length; i++) {
                result[gp1Int.length + gp2Int.length + i] = Integer.parseInt(gp3Int[i]);
            }
        } else {
            gp3Int = new String[0];
        }
        return result; // You need to replace this line by returning the proper result.
    }


    public static int[] zigZagFlatten(int[][] twoDimArray) {

        int[] zigzag = new int[0];

        for (int i = 0; i < twoDimArray.length; i++) {
            if (twoDimArray[i] == null || twoDimArray[i].length == 0) {
                continue;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < twoDimArray[i].length; j++) {
                    int[] temp = new int[zigzag.length + 1];
                    System.arraycopy(zigzag, 0, temp, 0, zigzag.length); //use instead of manual array copy
                    temp[temp.length - 1] = twoDimArray[i][j];
                    zigzag = temp;
                }
            } else {
                for (int j = twoDimArray.length - 1; j >= 0; j--) {
                    int[] temp = new int[zigzag.length + 1];
                    for (int k = 0; k < zigzag.length; k++) {
                        temp[k] = zigzag[k];
                    }
                    temp[temp.length - 1] = twoDimArray[i][j];
                    zigzag = temp;
                }
            }

        }

        return zigzag; // You need to replace this line by returning the proper result.
    }

    public static int[] addToArray(int n, int[] array) {
        int[] temp = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp[array.length] = n;
        return temp;
    }
}

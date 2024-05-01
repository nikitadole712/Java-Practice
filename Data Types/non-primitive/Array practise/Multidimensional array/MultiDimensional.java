public class MultiDimensional {
    public static void main(String[] args) {
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } }; // Declare two dimensional array
        System.out.println(myNumbers[1][2]); // Access Elements

        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Change Element Values

        for (int i = 0; i < myNumbers.length; ++i) { // Loop Through a Multi-Dimensional Array
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }


            for (int[] row : myNumbers) {       //for-each Loop Through a Multi-Dimensional Array
                for (int k : row) {
                  System.out.println(k);
                }
              }
        }
    }

}

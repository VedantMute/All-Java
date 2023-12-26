public class p6_multidimensional_arrays {
    public static void main(String[] args) {

        // int [] [] flats = new int[2][3];
        // // 2 rows 3 columns
        // flats[0][0] = 000;
        // flats[0][1] = 001;
        // flats[0][2] = 002;
        // flats[1][0] = 101;
        // flats[1][1] = 102;
        // flats[1][2] = 103;
        // for (int i = 0; i < flats.length; i++) {
        // for (int j = 0; j < flats[i].length; j++) {
        // System.out.println(flats[i][j]);
        // }
        // }
        // int [] marks ={1,2,3,4,5};

        // for (int i : marks) {
        // if(marks[i]==5){
        // System.out.println("element present");
        // }
        // }

        int[][] matrix1 = { { 1, 2, 3 }, { 3, 4, 5 } };
        int[][] matrix2 = { { 7, 8, 3 }, { 13, 14, 15 } };
        int[][] answer = { { 0, 0, 0 }, { 0, 0, 0 } };

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) { // Fix: Change i to j

                answer[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) { // Fix: Change i to j
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class ZeroMatrix {

    static int[][] zeroMatrix(int[][] mat) {
        boolean[] rowsFlag = new boolean[mat.length];
        boolean[] colsFlag = new boolean[mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 0) {
                    rowsFlag[i] = true;
                    colsFlag[j] = true;
                }
            }
        }

        for (int i = 0; i < rowsFlag.length; i++) {
            if (rowsFlag[i])
                nullifyRow(mat, i);
        }

        for (int j = 0; j < colsFlag.length; j++) {
            if (colsFlag[j])
                nullifyCol(mat, j);
        }

        return mat;
    }

    static void nullifyRow(int[][] mat, int row) {
        for (int i = 0; i < mat.length; i++) {
            mat[row][i] = 0;
        }
    }

    static void nullifyCol(int[][] mat, int col) {
        for (int i = 0; i < mat.length; i++) {
            mat[i][col] = 0;
        }
    }

    static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 0 },
                { 7, 8, 9 }
        };

        printMatrix(zeroMatrix(mat));

    }
}

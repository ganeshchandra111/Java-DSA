public class RotateMatrix {
    static int[][] rotateMatrix(int[][] mat){

        for(int i =0; i<mat.length;i++){
            for(int j =i;j<mat.length;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i =0; i<mat.length;i++){
            int first=0,last=mat.length-1;

            while(first<last || first!=last){
                int temp = mat[i][first];
                mat[i][first] = mat[i][last];
                mat[i][last] = temp;
                first++;last--;
            }

        }

        return mat;
    }

    static void printMatrix(int[][] mat){
        for(int i =0; i<mat.length;i++){
            for(int j =0;j<mat.length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        
        printMatrix(rotateMatrix(mat));
        printMatrix(rotateMatrix(mat));
        printMatrix(rotateMatrix(mat));
        printMatrix(rotateMatrix(mat));
    }
}

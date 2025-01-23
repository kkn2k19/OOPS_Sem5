// 3. Define a class Sparse. Take a sparse matrix of Size M x N and represent that sparse
// matrix in Triplet format. 

// package ChapterB_101_3;
import java.util.Arrays;

public class ChapterB_101_3 {
    public static void main(String[] args) {
        int[][] sparseMatrix = {
                { 0, 0, 0, 0, 0 },
                { 0, 0, 7, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 2, 0, 0, 0 }
        };
        Sparse obj = new Sparse();
        obj.sparse(sparseMatrix);
        obj.toTripletFormat();
    }
}

class Sparse {
    int[][] matrix;

    void sparse(int[][] matrix) {
        this.matrix = matrix;
    }

    void toTripletFormat() {
        int nonZeroCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    nonZeroCount++;
                }
            }
        }
        int[] rowIndices = new int[nonZeroCount];
        int[] colIndices = new int[nonZeroCount];
        int[] values = new int[nonZeroCount];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                if (value != 0) {
                    rowIndices[index] = i;
                    colIndices[index] = j;
                    values[index] = value;
                    index++;
                }
            }
        }

        System.out.println("Triplet Form of representation of Sparse matrix : ");
        System.out.println("Row Indices : " + Arrays.toString(rowIndices));
        System.out.println("Column Indices : " + Arrays.toString(colIndices));
        System.out.println("Values : " + Arrays.toString(values));
    }
}

/*
 * OUTPUT --
 * 
 * Triplet Form of representation of Sparse matrix :
 * Row Indices : [1, 3]
 * Column Indices : [2, 1]
 * Values : [7, 2]
 */

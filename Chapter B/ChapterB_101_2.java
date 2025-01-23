// 2. Define a class Matrix that contains a method, sumDiagonals(). This method will
// find out the sum of left and right diagonals of a matrix of size M x N.

// package ChapterB_101_2;

public class ChapterB_101_2 {
    public static void main(String[] args) {
        int[][] matrixData = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        Matrix obj = new Matrix();
        obj.matrix(matrixData);
        int totalSum = obj.sumDiagonals();
        System.out.println("Total Sum of Diagonals " + totalSum);
    }
}

class Matrix {
    int[][] matrix;

    void matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    int sumDiagonals() {
        int sumLeftDiagonals = 0;
        int sumRightDiagonals = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            System.out.println("Matrix is not Square. Diagonals can't be summed up");
            return 0;
        }
        for (int i = 0; i < rows; i++) {
            sumLeftDiagonals += matrix[i][i];
            sumRightDiagonals += matrix[i][rows - 1 - i];
        }

        System.out.println("sum of left Diagonals = " + sumLeftDiagonals);
        System.out.println("sum of right Diagonals = " + sumRightDiagonals);
        return sumLeftDiagonals + sumRightDiagonals;
    }
}

/*
 * OUTPUT --
 * 
 * sum of left Diagonals = 15
 * sum of right Diagonals = 15
 * Total Sum of Diagonals 30
 */
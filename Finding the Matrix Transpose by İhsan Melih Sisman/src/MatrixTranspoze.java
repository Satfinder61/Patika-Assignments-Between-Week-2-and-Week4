import java.util.Arrays;

public class MatrixTranspoze {
    public static void main(String[] args) {


        int[][] matrixOne ={{2, 3, 4},
                            {5, 6, 4}};

        System.out.println("Matris : ");
        for(int i = 0; i<matrixOne.length;i++){
            for (int j = 0; j<matrixOne[i].length;j++){
                System.out.print(matrixOne[i][j] + "\t");
            }
            System.out.println();

        }

        int row = 3;
        int column = 2;
        System.out.println("Transpoze : ");
        int [][] transpose = new int [row][column];
        for(int i = 0; i< transpose.length;i++){
            for (int j = 0; j<transpose[i].length;j++){
                transpose[i][j] = matrixOne[j][i];
                System.out.print(transpose[i][j] + "\t");

            }

            System.out.println();
        }

    }


}

public class Main {
    public static void main(String[] args) {


        int[][] matris = new int[2][3];
        int[][] transpozu = new int[3][2];
        int number = 1;

        for (int i = 0; i < matris.length; i++) {
            int[] row = matris[i];

            for (int j = 0; j < row.length; j++) {
                row[j] = number;
                number++;
            }
        }

        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[row].length; column++) {
                System.out.print(matris[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("#########");

        for (int row = 0; row < transpozu.length; row++) {
            for (int col = 0; col < transpozu[row].length; col++) {

                transpozu[row][col] = matris[col][row];
                System.out.print(transpozu[row][col] + " ");
            }
            System.out.println();
        }

    }
}
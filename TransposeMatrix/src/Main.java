public class Main {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6}};
        int[][] transpose = new int[3][3];

        // Matrix printing
        System.out.println("Matrix: ");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println();

        // Transpose printing
        System.out.println("Transpose: ");
        for(int i = 0; i < arr.length + 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
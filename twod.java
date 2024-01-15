
import java.util.*;

public class twod {
    public static void main(String args[]) {
        System.out.println("welcome to the aryan coder");
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of row");
        int row = s.nextInt();
        System.out.println("enter the size of column");
        int col = s.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("enter the vaue in array");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextInt();
            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();

        }

    }

}

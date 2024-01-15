import java.util.*;

public class arr {
    public static void main(String args[]) {
        System.out.println("welcome to the aryan world");
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int a = s.nextInt();
        int arr[] = new int[a];
        System.out.println("enter the value");
        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();

        }
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("enter the value u want to searche");
        int b = s.nextInt();
        for (int i = 0; i < a; i++) {
            if (arr[i] == b) {
                System.out.println(i);
            }

        }
    }

}

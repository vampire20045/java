
import java.util.*;

public class c {
    public static void main(String[] args) {
        System.out.println("please enter your choice");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        switch (b) {
            case 1:
                System.out.println("first button is pressed ");
                break;
            case 2:
                System.out.println("third button is pressed ");
                break;
            case 3:
                System.out.println("second  button is pressed ");
                break;
            default:
                System.out.println("please enter the correct the choice ");

        }
    }

}

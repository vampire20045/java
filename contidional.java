import java.util.*;

public class contidional {
    public static void main(String[] args){
        System.out.print("hello guyz enter the age");
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        if(a>18){
            System.out.println("you are elgible to vote");
        }
        else{
            System.out.println("no u r not eligible ");
        }

    }
}

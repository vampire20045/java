import java.util.*;
public class func {
    public static void add(int a,int b){
        System.out.print(a+b);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        

        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);



    }
}

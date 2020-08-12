import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args){
        int a,b,temp ;

        System.out.println("Enter 2 values");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of First Variable : " +a);
        System.out.println("Value of Second Variable : " +b);

    }
}

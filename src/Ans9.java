import java.util.Scanner;

public class Ans9 {

    private static Scanner sc;
    public static void main(String[] args) {
        String uppStr;
        sc= new Scanner(System.in);//Object Creation

        System.out.println("nEnter Uppercase String to convert = ");
        uppStr = sc.nextLine();
        String uppStr2 = uppStr.toLowerCase();
        System.out.println("\nThe Lowercase String = " + uppStr2);


    }
}

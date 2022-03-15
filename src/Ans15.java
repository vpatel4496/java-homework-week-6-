import java.util.Scanner;

public class Ans15 {

    public static void main(String[] args) {

        int v, m, p;
        Scanner in = new Scanner(System.in);

        System.out.println("Input the first number: ");
        v = in.nextInt();
        System.out.println("Input the second number: ");
        m = in.nextInt();

        p = v;
        v = m;
        m = p;

        System.out.println(" Swapped values are:" + v +" and " + m);




    }



}

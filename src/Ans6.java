import java.util.Scanner;

public class Ans6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the radius: ");
        /**We are storing the entered radius in double
         * because a user can enter radius in decimals
         */
        double radius = sc.nextDouble();
        //Area = PI*redius*redius
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);

    }

}

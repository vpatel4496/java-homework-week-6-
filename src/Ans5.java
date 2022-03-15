public class Ans5 {

    public void addition(int a,int b){
        int sum=a+b;
        System.out.println(a+"+" +b+ "=" +sum);
    }
    public void subtraction( int a, int b) {
        int sum=a-b;
        System.out.println(a+ "-" +b+ "=" +sum);
    }
    static void multiplication( int a, int b){
        int sum=a*b;
        System.out.println(a+ "*" +b+ "=" +sum);
    }
    static void division(double a, double b){
        double sum=a/b;
        System.out.println(a+ "/" +b+ "=" +sum);

    }


    public static void main(String[] args) {
        Ans5 obj =new Ans5();
        obj.addition(5,10);
        obj.subtraction(5,10);
        Ans5.multiplication(5,10);
        Ans5.division(5,10);
    }



}

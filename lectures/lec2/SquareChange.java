public class SquareChange {
    public static void printSqaure(int x) {
        System.out.println("printSqaure x = "+x);
        x =x*x;
        System.out.println("printSquare x = "+ x);
    }

    public static void main(String[] args) {
        int x  = 5;
        System.out.println("main x = "+x);
        printSqaure(x);
        System.out.println("main x = "+x);
    }
}

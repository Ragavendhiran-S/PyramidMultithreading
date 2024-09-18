import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LinesAreNotOdd {
        System.out.print("Enter Odd No : ");
        PyramidThreadPattern pattern = new PyramidThreadPattern(new Scanner(System.in).nextInt());
        pattern.start();
    }
}

package task3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("введіть a і b для лінійного рівняння");
        LinearInter linearEq = new LinearInter(sc.nextInt(), sc.nextInt());
        linearEq.printResult();
        System.out.println("введіть a, b і c для квадратного рівняння");
        SquareInter squareEq = new SquareInter(sc.nextInt(), sc.nextInt(), sc.nextInt());
        squareEq.printResult();
    }
}

package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введіть a і b для лінійного рівняння");
        Linear linearEq = new Linear(sc.nextInt(), sc.nextInt());
        linearEq.printResult();
        System.out.println("введіть a, b і c для квадратного рівняння");
        Square squareEq = new Square(sc.nextInt(), sc.nextInt(), sc.nextInt());
        squareEq.printResult();
    }
}

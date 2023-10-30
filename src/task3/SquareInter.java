package task3;

import RootClasses.Rootable;

public class SquareInter implements Rootable {
    private double a;
    private double b;
    private double c;
    public SquareInter(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void calculateRoots() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots of the quadratic equation are: " + root1 + ", " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root of the quadratic equation is: " + root);
        } else {
            System.out.println("No real roots");
        }
    }
    @Override
    public void printResult() {
        calculateRoots();
    }
}

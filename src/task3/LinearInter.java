package task3;

import RootClasses.Rootable;

public class LinearInter implements Rootable {
    private double a;
    private double b;
    public LinearInter(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void calculateRoots() {
        if (a == 0) {
            System.out.println("No roots (a must be non-zero for a linear equation)");
        } else {
            double root = -b / a;
            System.out.println("The root of the linear equation is: " + root);
        }
    }
    @Override
    public void printResult() {
        calculateRoots();
    }
}

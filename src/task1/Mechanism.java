package task1;

public class Mechanism extends Detail {
    int numParts;

    public Mechanism(String name, int weight, int numParts) {
        super(name, weight);
        this.numParts = numParts;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Кількість частин: " + numParts);
    }
}
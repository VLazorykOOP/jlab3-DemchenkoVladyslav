package task1;

public class Node extends Detail {
    String type;
    public Node(String name, int weight, String type) {
        super(name, weight);
        this.type = type;
    }
    @Override
    public void show() {
        super.show();
        System.out.println("Тип: " + type);
    }
}


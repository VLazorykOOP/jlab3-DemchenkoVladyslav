package task1;

public class Product extends Detail {
    String material;
    public Product(String name, int weight, String material) {
        super(name, weight);
        this.material = material;
    }
    @Override
    public void show() {
        super.show();
        System.out.println("Матеріал: " + material);
    }
}
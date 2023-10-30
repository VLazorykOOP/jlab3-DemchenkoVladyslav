package task1;

public class Detail {
    String name;
    int weight;
    public Detail(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public void show() {
        System.out.println("Назва: " + name);
        System.out.println("Вага: " + weight + " г");
    }
}
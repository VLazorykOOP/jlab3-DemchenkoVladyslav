package task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Detail detail = new Detail("Болт", 10);
        detail.show();
        Mechanism mechanism = new Mechanism("Годинник", 100, 50);
        mechanism.show();
        Product product = new Product("Стіл", 2000, "Дерево");
        product.show();
        Node node = new Node("Електрод", 5, "Провід");
        node.show();
        List<Detail> l = new ArrayList<>();
        l.add(detail);
        l.add(mechanism);
        l.add(product);
        l.add(node);
        for (Detail s : l) {
            s.show();
            System.out.println();
        }
    }
}

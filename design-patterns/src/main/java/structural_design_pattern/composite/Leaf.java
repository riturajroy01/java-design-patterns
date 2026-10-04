package structural_design_pattern.composite;

public class Leaf implements Component {
    String name;
    int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice()
    {
        System.out.println("Name: " + name + ", Price: " + price);
    }
}

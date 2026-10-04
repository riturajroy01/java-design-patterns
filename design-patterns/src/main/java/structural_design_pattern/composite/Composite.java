package structural_design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    String name;

    public Composite(String name) {
        this.name = name;
    }

    List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println("Name: " + name);
        for (Component component : components) {
            component.showPrice();
        }
    }
}

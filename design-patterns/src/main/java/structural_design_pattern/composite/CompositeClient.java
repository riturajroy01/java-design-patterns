package structural_design_pattern.composite;

public class CompositeClient {

    public static void main(String[] args) {
        Component hardDisk = new Leaf("Hard Disk", 5000);
        Component mouse = new Leaf("Mouse", 500);
        Component monitor = new Leaf("Monitor", 10000);
        Component ram = new Leaf("RAM", 3000);
        Component cpu = new Leaf("CPU", 4000);

        Composite computer = new Composite("New Computer");
        Composite peripherals = new Composite("Peripherals");
        Composite cabinet = new Composite("Cabinet");
        Composite motherboard = new Composite("Motherboard");

        peripherals.addComponent(mouse);
        peripherals.addComponent(monitor);
        cabinet.addComponent(hardDisk);
        cabinet.addComponent(motherboard);
        motherboard.addComponent(ram);
        motherboard.addComponent(cpu);
        computer.addComponent(peripherals);
        computer.addComponent(cabinet);

        hardDisk.showPrice();
        System.out.println("===================================");
        peripherals.showPrice();
        System.out.println("===================================");
        computer.showPrice();




    }
}

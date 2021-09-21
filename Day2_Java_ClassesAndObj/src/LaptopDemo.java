public class LaptopDemo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.initialize(5,5,"Intel",14.6);
        Laptop l2 = new Laptop();
        l2.initialize(4,6,"Dell",15.7);
        l1.Display();
        l2.Display();
    }
}

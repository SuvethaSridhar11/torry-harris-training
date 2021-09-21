public class BoxDemo {
    public static void main(String[] args) {
        Box b2 = new Box(100,50,200);
        b2.Display();
        System.out.println("Volume of the box is "+b2.getVolume());
        b2.setLength((110*b2.getLength())/100);
        b2.setHeight((108*b2.getLength())/100);
        b2.setWidth((120*b2.getLength())/100);
        b2.Display();
        System.out.println("Volume of the box after changes is "+b2.getVolume());
    }
}

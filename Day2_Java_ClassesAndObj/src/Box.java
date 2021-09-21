public class Box {
    private int length;
    private int width;
    private int height;

    public void initialize(int l,int w,int h) {
        length = l;
        width = w;
        height = h;
    }
    public void Display(){
        System.out.println("length is "+length);
        System.out.println("width is "+width);
        System.out.println("height is "+height);
    }

    public int getVolume() {
        return length*width*height;
    }

    public int getArea() {
        return 2*length*width+2*length*height+2*width*height;
    }
    public Box(){
        System.out.println("Inside a constructor");
    }
    public Box(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
        System.out.println("Parametrized constructor: ");
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

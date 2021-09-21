import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Laptop {
    private int RAM;
    private int HDD;
    private String processor;
    private double screensize;
    public void initialize(int r,int h,String p,double s){

        RAM = r;
        HDD = h;
        processor = p;
        screensize =s;
    }
    public void Display(){
        System.out.println("RAM is "+RAM);
        System.out.println("HDD is "+HDD);
        System.out.println("processor is "+processor);
        System.out.println("screensize is "+screensize);

    }

}

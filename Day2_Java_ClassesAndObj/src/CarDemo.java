public class CarDemo {
    public static void main(String[] args) {
        Tyre mrf = new Tyre("MRF",16);
        MusicSystem sony = new MusicSystem("sony",4,true,16);
        Car c1 = new Car("chevrolet","Petrol",1500,94.5f,5,mrf);
        c1.setMusicSystem(sony);
        c1.displayFeatures();
        c1.accelerate();
        c1.applyBrake();
        c1.changeGear(2);
        c1.changeGear(3);
        c1.changeGear(6);
        c1.steer();
        c1.setMusicSystem(sony);


    }
}

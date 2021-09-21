import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

public class Car {
    private String name;
    private String FuelType;
    private int engineCapacity;
    private float power;
    private int noOfGears;
    private Tyre tyre;
    private MusicSystem musicSystem;

    public Car(String name,String fuelType, int engineCapacity, float power, int noOfGears,Tyre tyre) {
        this.name = name;
        this.FuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.noOfGears = noOfGears;
        this.tyre = tyre;

    }
    public String getName() {
        return name;
    }

    public String getFuelType() {
        return FuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public float getPower() {
        return power;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }
    public Tyre getTyre(){
        return tyre;
    }
    public void setTyre(Tyre tyre){
        this.tyre=tyre;
    }

    public MusicSystem getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    public void accelerate()
    {
        System.out.println(name+" Car is accelerating..");
    }
    public void applyBrake(){
        System.out.println(name+" car is slowing/stopping..");
    }
    public void changeGear(int gear){
        if(gear<0 || gear>noOfGears)
            System.out.println("wrong gear");
        else
            System.out.println(name+" car is changing gear to" +gear);
    }


    public void steer(){
        System.out.println(name+ " car is changing direction");
    }
    public void displayFeatures(){
        System.out.println("Features of "+name+" are:");
        System.out.println("-----------------------");
        System.out.println("engine capacity is"+engineCapacity+"CC");
        System.out.println("Fuel type : "+FuelType);
        System.out.println("Power is "+power+"BHP");
        System.out.println("No. of gears is : "+noOfGears);
        System.out.println("Tyre: name -> "+tyre.getTyreName()+"size -> "+tyre.getSize()+"inches");
        System.out.println("MusicSystem: name -> " +musicSystem.getName()+ "\nNo. of Speakers-> "+musicSystem.getNoOfSpeakers()+
                "\nLCD screen size -> "+musicSystem.getLCDScreenSize());
    }
}
public class MusicSystem {
    private String name;
    private int noOfSpeakers;
    private boolean subWoofers;
    private int LCDScreenSize;

    public MusicSystem(String name, int noOfSpeakers, boolean subWoofers, int LCDScreenSize) {
        this.name = name;
        this.noOfSpeakers = noOfSpeakers;
        this.subWoofers = subWoofers;
        this.LCDScreenSize = LCDScreenSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public void setNoOfSpeakers(int noOfSpeakers) {
        this.noOfSpeakers = noOfSpeakers;
    }

    public boolean isSubWoofers() {
        return subWoofers;
    }

    public void setSubWoofers(boolean subWoofers) {
        this.subWoofers = subWoofers;
    }

    public int getLCDScreenSize() {
        return LCDScreenSize;
    }

    public void setLCDScreenSize(int LCDScreenSize) {
        this.LCDScreenSize = LCDScreenSize;
    }
}

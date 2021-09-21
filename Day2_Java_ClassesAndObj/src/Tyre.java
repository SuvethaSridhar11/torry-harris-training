public class Tyre {
    private String TyreName;
    private int Size;


    public Tyre(String TyreName, int Size) {
        this.TyreName = TyreName;
        this.Size = Size;
    }

    public String getTyreName() {
        return TyreName;
    }

    public int getSize() {
        return Size;
    }

    public void setTyreName(String tyreName) {
        TyreName = tyreName;
    }

    public void setSize(int size) {
        Size = size;
    }
}

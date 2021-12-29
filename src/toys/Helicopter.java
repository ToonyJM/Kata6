package toys;

public class Helicopter {
    private final Integer SerialNumber;
    private final String type = "helicopter";

    public Helicopter(Integer SerialNumber) {
        this.SerialNumber = SerialNumber;
    }
    
    public Integer getSerialNumber() {
        return SerialNumber;
    }

    public String getType() {
        return type;
    }

    public void pack() {
        System.out.printf("Packing '%s' %d'\n",this.type, this.SerialNumber);
    }
    
    public void label() {
        System.out.printf("Labelling '%s' %d'\n",this.type, this.SerialNumber);
    }
}

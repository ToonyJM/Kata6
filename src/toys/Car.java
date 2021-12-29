package toys;

public class Car {
    private final Integer SerialNumber;

    public Car(Integer SerialNumber) {
        this.SerialNumber = SerialNumber;
    }
    
    public Integer getSerialNumber() {
        return SerialNumber;
    }

    public void pack() {
        System.out.printf("Packing car '%d'\n",this.SerialNumber);
    }
    
    public void label() {
        System.out.printf("Labelling car '%d'\n",this.SerialNumber);
    }
}

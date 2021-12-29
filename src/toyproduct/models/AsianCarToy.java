package toyproduct.models;

import toyproduct.Toy;

public class AsianCarToy implements Toy{
    private final Integer SerialNumber;
    private final String type = "car";

    public AsianCarToy(Integer SerialNumber) {
        this.SerialNumber = SerialNumber;
    }
    
    @Override
    public Integer getSerialNumber() {
        return SerialNumber;
    }

    public String getType() {
        return type;
    }

    @Override
    public void pack() {
        System.out.printf("Packing '%s' %d'\n",this.type, this.SerialNumber);
    }
    
    @Override
    public void label() {
        System.out.printf("Labelling '%s' %d'\n",this.type, this.SerialNumber);
    }

    @Override
    public String toString() {
        return "AsianCarToy{" + "SerialNumber=" + SerialNumber + '}';
    }
    
}

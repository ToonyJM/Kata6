package business;

import toyproduct.Toy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AmericanCarToy;
import toys.SerialNumberGenerator;

public abstract class ToyBusiness {
    protected final SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
    
}
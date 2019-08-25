package Vehicle;

import Car.*;
import SUV.*;

public class NonLuxuryVehicleFactory extends VehicleFactory {
    @Override
    public Car getCar() {
        return new NonLuxuryCar("NL-C");
    }

    public Suv getSuv(){
        return new NonLuxurySuv("NL-S");
    }
}

package Vehicle;

import Car.*;
import SUV.*;

public class LuxuryVehicleFactory extends VehicleFactory{

    public Car getCar(){
        return new LuxuryCar("L-C");
    }

    public Suv getSuv(){
        return new LuxurySuv("L-S");
    }
}

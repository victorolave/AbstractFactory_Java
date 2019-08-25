package Vehicle;

import Car.Car;
import SUV.Suv;

public abstract class VehicleFactory {

    public static final String LUXURY_VEHICLE = "Luxury";
    public static final String NON_LUXURY_VEHICLE = "NonLuxury";

    public abstract Car getCar();

    public abstract Suv getSuv();

    public static VehicleFactory getVehicleFactory(String type)
    {
        if(type.equals(VehicleFactory.LUXURY_VEHICLE))
            return new LuxuryVehicleFactory();

        if(type.equals(VehicleFactory.NON_LUXURY_VEHICLE))
            return new NonLuxuryVehicleFactory();

        return new LuxuryVehicleFactory();
    }
}

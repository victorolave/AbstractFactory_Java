import Vehicle.*;
import Car.*;
import SUV.*;

public class ClientMain {

    public static void main(String[] args) {
        String vhCategory = "NonLuxury";
        String vhType = "Car";
        String searchResult = "";

        VehicleFactory vf = VehicleFactory.getVehicleFactory(vhCategory);

        if (vhType.equals("Car")){
            Car c = vf.getCar();
            searchResult = "Name: " + c.getCarName() + " Features: " + c.getCarFeatures();
        }

        if (vhType.equals("Suv"))
        {
            Suv s = vf.getSuv();
            searchResult = "Name: " + s.getSuvName() + " Features: " + s.getSuvFeatures();
        }

        System.out.println(searchResult);
    }
}

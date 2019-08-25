package SUV;

public class NonLuxurySuv implements Suv{

    private String name;

    public NonLuxurySuv(String sName)
    {
        name = sName;
    }

    public String getSuvName()
    {
        return name;
    }

    public String getSuvFeatures()
    {
        return "Non Luxury Suv Features";
    }
}

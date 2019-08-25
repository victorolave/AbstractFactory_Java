package SUV;

public class LuxurySuv implements Suv {

    private String name;

    public LuxurySuv(String sName)
    {
        name = sName;
    }

    public String getSuvName()
    {
        return name;
    }

    public String getSuvFeatures()
    {
        return "Luxury Suv Features";
    }
}

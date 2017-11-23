package Lab2;

/**
 * Created by Olya_Sparkle on 10/23/17.
 */
public enum FuelType {
    EURO("95"),
    PREMIUM("97"),
    DIESEL("D"),
    BIODIESEL("BioD"),
    ELECTRICITY("Electro");

    public final String fuelType;

    FuelType(String fuelType) {
        this.fuelType =fuelType;
    }
}

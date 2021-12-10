package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {

    // --- attributes ---------------------------------------------------------

    private String description;
    private String brand;
    private String serialNumber;
    private List<String> extras;
    private int price;

    // --- constructors -------------------------------------------------------

    public BikeAdvertisement(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public BikeAdvertisement(String description, int price, String brand) {
        this(description, price);
        this.brand = brand;
    }

    public BikeAdvertisement(String description, int price, String brand, List<String> extras) {
        this(description, price, brand);
        this.extras = extras;
    }

    public BikeAdvertisement(String description, int price, String brand, List<String> extras, String serialNumber) {
        this(description, price, brand, extras);
        this.serialNumber = serialNumber;
    }

    // --- getters and setters ------------------------------------------------

    public String getDescription() { return description; }
    public String getBrand() { return brand; }
    public String getSerialNumber() { return serialNumber; }
    public List<String> getExtras() { return extras; }
    public int getPrice() { return price; }
}
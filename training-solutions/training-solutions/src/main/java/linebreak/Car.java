package linebreak;

public class Car {

    public String getBrandAndTypeInSeparateLines(String brand, String type) {
        return brand + System.lineSeparator() + type;
    }
}

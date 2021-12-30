package interfacerules;

public class ParkingPlace implements Length, Width {

    @Override
    public double gerLength() {
        return 5.0;
    }

    @Override
    public double getWidth() {
        return 2.2;
    }
}
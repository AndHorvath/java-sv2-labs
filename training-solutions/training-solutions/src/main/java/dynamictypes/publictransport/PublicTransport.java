package dynamictypes.publictransport;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport {

    // --- attributes ---------------------------------------------------------

    private List<PublicVehicle> publicVehicles;

    // --- constructors -------------------------------------------------------

    public PublicTransport() {
        publicVehicles = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<PublicVehicle> getPublicVehicles() { return publicVehicles; }

    // --- public methods -----------------------------------------------------

    public void addVehicle(PublicVehicle vehicle) {
        publicVehicles.add(vehicle);
    }
}
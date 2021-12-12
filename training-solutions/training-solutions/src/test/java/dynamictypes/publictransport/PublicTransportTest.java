package dynamictypes.publictransport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    PublicTransport publicTransport;

    PublicVehicle publicVehicleA;
    PublicVehicle publicVehicleB;
    PublicVehicle publicVehicleC;

    @BeforeEach
    void setUp() {
        publicTransport = new PublicTransport();

        publicVehicleA = new Bus(2, 15.5d, "MAN");
        publicVehicleB = new Tram(3, 25.5d, 2);
        publicVehicleC = new Metro(4, 30.5, 15);
    }

    @Test
    void getPublicVehiclesTest() {
        assertEquals(new ArrayList<>(), publicTransport.getPublicVehicles());
    }

    @Test
    void addVehicleTest() {
        publicTransport.addVehicle(publicVehicleA);
        publicTransport.addVehicle(publicVehicleB);
        publicTransport.addVehicle(publicVehicleC);

        assertEquals(
                Arrays.asList(publicVehicleA, publicVehicleB, publicVehicleC),
                publicTransport.getPublicVehicles());
    }
}
package nestedclasses.dns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NameServerTest {

    NameServer nameServer;
    Throwable exception;
    String hostName;
    String hostIp;

    @BeforeEach
    void setUp() {
        nameServer = new NameServer();
        nameServer.addEntry("AAA", "111-111");
        nameServer.addEntry("BBB", "222-222");
    }

    @Test
    void addEntryTest() {
        hostName = "CCC";
        hostIp = "333-333";

        nameServer.addEntry(hostName, hostIp);

        exception = assertThrows(
            IllegalArgumentException.class, () -> nameServer.addEntry(hostName, "444-444"));
        assertEquals("Already exists", exception.getMessage());

        exception = assertThrows(
            IllegalArgumentException.class, () -> nameServer.addEntry("DDD", hostIp));
        assertEquals("Already exists", exception.getMessage());
    }

    @Test
    void removeEntryByNameTest() {
        hostName = "AAA";
        nameServer.removeEntryByName(hostName);

        exception = assertThrows(
            IllegalArgumentException.class, () -> nameServer.getIpByName(hostName));
        assertEquals("Element not found", exception.getMessage());

        assertDoesNotThrow(() -> nameServer.removeEntryByName(hostName));
    }

    @Test
    void removeEntryByIpTest() {
        hostIp = "222-222";
        nameServer.removeEntryByIp(hostIp);

        exception = assertThrows(
            IllegalArgumentException.class, () -> nameServer.getNameByIp(hostIp));
        assertEquals("Element not found", exception.getMessage());

        assertDoesNotThrow(() -> nameServer.removeEntryByIp(hostIp));
    }

    @Test
    void getIpByNameTest() {
        assertEquals("111-111", nameServer.getIpByName("AAA"));

        exception = assertThrows(
            IllegalArgumentException.class, () -> nameServer.getIpByName("CCC"));
        assertEquals("Element not found", exception.getMessage());
    }

    @Test
    void getNameByIpTest() {
        assertEquals("BBB", nameServer.getNameByIp("222-222"));

        exception = assertThrows(
            IllegalArgumentException.class, () -> nameServer.getNameByIp("333-333"));
        assertEquals("Element not found", exception.getMessage());
    }
}
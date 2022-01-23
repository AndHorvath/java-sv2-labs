package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    // --- inner classes ------------------------------------------------------

    private static class DnsEntry {

        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }
    }

    // --- attributes ---------------------------------------------------------

    private List<DnsEntry> dnsEntries;

    // --- constructors -------------------------------------------------------

    public NameServer() {
        this.dnsEntries = new ArrayList<>();
    }

    // --- public methods -----------------------------------------------------

    public void addEntry(String hostName, String hostIp) {
        validateParameter(hostName, hostIp);
        dnsEntries.add(new DnsEntry(hostName, hostIp));
    }

    public void removeEntryByName(String hostName) {
        if (doesExistByName(hostName)) {
            DnsEntry dnsEntry = getEntryByName(hostName);
            dnsEntries.remove(dnsEntry);
        }
    }

    public void removeEntryByIp(String hostIp) {
        if (doesExistByIp(hostIp)) {
            DnsEntry dnsEntry = getEntryByIp(hostIp);
            dnsEntries.remove(dnsEntry);
        }
    }

    public String getIpByName(String hostName) {
        DnsEntry dnsEntry = getEntryByName(hostName);
        return dnsEntry.hostIp;
    }

    public String getNameByIp(String hostIp) {
        DnsEntry dnsEntry = getEntryByIp(hostIp);
        return dnsEntry.hostName;
    }

    // --- private methods ----------------------------------------------------

    private boolean doesExistByName(String hostName) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostName.equals(hostName)) {
                return true;
            }
        }
        return false;
    }

    private boolean doesExistByIp(String hostIp) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostIp.equals(hostIp)) {
                return true;
            }
        }
        return false;
    }

    private DnsEntry getEntryByName(String hostName) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostName.equals(hostName)) {
                return dnsEntry;
            }
        }
        throw new IllegalArgumentException(createNotFoundMessage());
    }

    private DnsEntry getEntryByIp(String hostIp) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostIp.equals(hostIp)) {
                return dnsEntry;
            }
        }
        throw new IllegalArgumentException(createNotFoundMessage());
    }

    private void validateParameter(String hostName, String hostIp) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostName.equals(hostName) || dnsEntry.hostIp.equals(hostIp)) {
                throw new IllegalArgumentException("Already exists");
            }
        }
    }

    private String createNotFoundMessage() {
        return "Element not found";
    }
}
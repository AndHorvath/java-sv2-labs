package lamdacomparator.cloud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clouds {

    // --- attributes ---------------------------------------------------------

    private List<CloudStorage> cloudStorages;
    private static final int RESULT_LENGTH = 3;

    // --- constructors -------------------------------------------------------

    public Clouds() {
        cloudStorages = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<CloudStorage> getCloudStorages() { return cloudStorages; }

    // --- public methods -----------------------------------------------------

    public void addCloudStorage(CloudStorage cloudStorage) {
        cloudStorages.add(cloudStorage);
    }

    public CloudStorage alphabeticallyFirst() {
        return Collections.min(
            cloudStorages,
            Comparator.comparing(
                CloudStorage::getProvider,
                String::compareToIgnoreCase
            )
        );
    }

    public CloudStorage bestPriceForShortestPeriod() {
        return Collections.min(
            cloudStorages,
            Comparator
                .comparing(
                    CloudStorage::getPayPeriod,
                    Comparator.nullsFirst(Comparator.comparingInt(PayPeriod::getLength))
                )
                .thenComparingDouble(
                    CloudStorage::getPrice
                )
        );
    }

    public List<CloudStorage> worstOffers() {
        List<CloudStorage> auxList = new ArrayList<>(cloudStorages);
        auxList.sort(Comparator.reverseOrder());
        return auxList.subList(0, Math.min(auxList.size(), RESULT_LENGTH));
    }
}
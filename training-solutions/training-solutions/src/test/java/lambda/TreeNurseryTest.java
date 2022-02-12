package lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TreeNurseryTest {

    TreeNursery treeNursery;
    List<Sapling> saplings;

    @BeforeEach
    void setUp() {
        saplings = new ArrayList<>(Arrays.asList(
            new Sapling("Tree A", 100), new Sapling("Tree B", 110),
            new Sapling("Tree B", 120), new Sapling("Tree B", 130)
        ));
        treeNursery = new TreeNursery(saplings);
    }

    @Test
    void getSaplingsTest() {
        assertEquals(saplings, treeNursery.getSaplings());
    }

    @Test
    void pruneTest() {
        treeNursery.prune(110);

        assertEquals(100, treeNursery.getSaplings().get(0).getHeight());
        assertEquals(110, treeNursery.getSaplings().get(1).getHeight());
        assertEquals(110, treeNursery.getSaplings().get(2).getHeight());
        assertEquals(110, treeNursery.getSaplings().get(3).getHeight());
    }

    @Test
    void sellTest() {
        treeNursery.sell("Tree B", 120);

        assertEquals(2, treeNursery.getSaplings().size());

        assertEquals("Tree A", treeNursery.getSaplings().get(0).getSpecies());
        assertEquals("Tree B", treeNursery.getSaplings().get(1).getSpecies());

        assertEquals(100, treeNursery.getSaplings().get(0).getHeight());
        assertEquals(110, treeNursery.getSaplings().get(1).getHeight());
    }
}
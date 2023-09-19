import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database database = new Database();
    //private ArrayList<Superhelt> superhelte = new ArrayList<>();

    @BeforeEach
    void setUp() {
        database = new Database();
        database.hentSuperhelt().addAll(List.of(
                new Superhelt("Bruce Wayne", "Batman", "Utility belt", "ja", 1939, 100),
                new Superhelt("Clark Kent", "Superman", "Superstyrke", "nej", 1938, 1000),
                new Superhelt("Diana Prince", "Wonderwoman", "Lasso of truth", "nej", 1941, 500)));
    }

    @AfterEach
    void tearDown() {
        database = null;
    }

    @Test
    void tilføjSuperhelt() {
        int startSize = database.hentSuperhelt().size();
        database.tilføjSuperhelt("Bruce Wayne", "Batman", "Utility belt", "ja", 1939, 100);
        int expectedDBSize = startSize + 1;
        int actualSize = database.hentSuperhelt().size();
        assertEquals(expectedDBSize, actualSize);
    }

    @Test
    void søgSuperhelte() {
        Superhelt expectedSize = database.hentSuperhelt().get(0);
        expectedSize = database.søgSuperhelte("bruce");
        assertTrue(true);

    }

    @Test
    void sletSuperhelt() {
        String superhelteNavn = "Batman";
        database.sletSuperhelt(superhelteNavn);
        Superhelt fundet = database.søgSuperhelte(superhelteNavn);
        assertNull(fundet);
    }
}
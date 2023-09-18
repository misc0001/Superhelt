import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database database = new Database();

    @BeforeEach
    void setUp() {
        database = new Database();
    }

    @AfterEach
    void tearDown() {
        database = null;
    }

    @Test
    void tilføjSuperhelt() {
        String navn = "Bruce Wayne";
        String superhelteNavn = "Batman";
        String superkraft = "Utility belt";
        String erMenneske = "ja";
        int debutÅr = 1939;
        int styrke = 100;
        Superhelt superhelt = new Superhelt(navn, superhelteNavn, superkraft, erMenneske, debutÅr, styrke);
        database.tilføjSuperhelt(superhelt);
        Superhelt denRigtigeSuperhelt = database.søgSuperhelte(navn);
        Superhelt denForventedeSuperhelt = new Superhelt(navn, superhelteNavn, superkraft, erMenneske, debutÅr, styrke);
        assertEquals(denForventedeSuperhelt, denRigtigeSuperhelt);
    }

    @Test
    void søgSuperhelte() {
        Superhelt superhelt = new Superhelt("Bruce Wayne ", "Batman ", "Utility belt", "ja ", 1939 , 100);
        database.tilføjSuperhelt(superhelt);
        Superhelt søgeResultat = database.søgSuperhelte("Bruce Wayne ");
        assertEquals(superhelt, søgeResultat);
    }
}
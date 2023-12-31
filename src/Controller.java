import java.util.ArrayList;

public class Controller {

    private Database database;


    public Controller(Database database) {
        this.database = database;
    }

    public void tilføjSuperhelt(String navn, String superhelteNavn, String superKraft, String erMenneske, int debutÅr, int styrke) {
        database.tilføjSuperhelt(navn, superhelteNavn, superKraft, erMenneske, debutÅr, styrke);
    }

    public ArrayList<Superhelt> hentSuperhelt() {
        return database.hentSuperhelt();
    }

    public Superhelt findSuperhelte(String navn) {
        return database.søgSuperhelte(navn);
    }

    public void sletSuperhelt(String superhelteNavn) {
        database.sletSuperhelt(superhelteNavn);
    }

}

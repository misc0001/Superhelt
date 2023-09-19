import java.util.ArrayList;
import java.util.Objects;

public class Database {
    private ArrayList<Superhelt> superhelte = new ArrayList<>();

    public void tilføjSuperhelt(String navn, String superhelteNavn, String superKraft, String erMenneske, int debutÅr, int styrke) {
        superhelte.add(new Superhelt(navn, superhelteNavn, superKraft,  erMenneske, debutÅr, styrke));
    }

    public ArrayList<Superhelt> hentSuperhelt() {
        return superhelte;
    }

    public Superhelt søgSuperhelte(String navn) {
        for (Superhelt superhelt : superhelte) {
            if (superhelt.getNavn().contains(navn) || (superhelt.getSuperhelteNavn().contains(navn))) {
                System.out.println(superhelt);
            }
        }
        return null;
    }

    public void sletSuperhelt(String superhelteNavn) {
        Superhelt fundet = null;
        for (Superhelt superhelt:superhelte) {
            if (superhelt.getSuperhelteNavn().contains(superhelteNavn));
            fundet = superhelt;
            break;
        }
        if(fundet != null) {
            superhelte.remove(fundet);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Database database = (Database) o;
        return Objects.equals(superhelte, database.superhelte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(superhelte);
    }

}

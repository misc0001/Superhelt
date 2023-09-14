import java.util.ArrayList;

public class Database {
    private ArrayList<Superhelt> superhelte = new ArrayList<>();

    public void tilføjSuperhelt(String navn, String superhelteNavn,String superKraft, String erMenneske, int debutÅr, int styrke) {
        superhelte.add(new Superhelt(navn, superhelteNavn, superKraft,  erMenneske, debutÅr, styrke));
    }

    public ArrayList<Superhelt> hentSuperhelt() {
        return superhelte;
    }

    public Superhelt søgSuperhelte(String navn){
        for (Superhelt superhelt : superhelte) {
            if (superhelt.getNavn().contains(navn) || (superhelt.getSuperhelteNavn().contains(navn))) {
                System.out.println(superhelt);
            }
        }
        return null;
    }
}

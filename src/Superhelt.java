public class Superhelt {
    private String navn;
    private String superhelteNavn;
    private String superkraft;
    private String erMenneske;
    private int debutÅr;
    private int styrke;

    //konstruktur
    public Superhelt(String navn, String superhelteNavn, String superkraft, String erMenneske, int debutÅr, int styrke) {
        this.navn = navn;
        this.superhelteNavn = superhelteNavn;
        this.superkraft = superkraft;
        this.erMenneske = erMenneske;
        this.debutÅr = debutÅr;
        this.styrke = styrke;
    }

    //Getter metode
    public String getNavn() {
        return navn;
    }

    public String getSuperhelteNavn() {
        return superhelteNavn;
    }

    public String getSuperkraft() {
        return superkraft;
    }

    public String getErMenneske() {
        return erMenneske;
    }

    public int getDebutÅr() {
        return debutÅr;
    }

    public int getStyrke() {
        return styrke;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setSuperhelteNavn(String superhelteNavn) {
        this.superhelteNavn = superhelteNavn;
    }

    public void setSuperkraft(String superkraft) {
        this.superkraft = superkraft;
    }

    public void setErMenneske(String erMenneske) {
        this.erMenneske = erMenneske;
    }

    public void setDebutÅr(int debutÅr) {
        this.debutÅr = debutÅr;
    }

    public void setStyrke(int styrke) {
        this.styrke = styrke;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Navn: ");
        stringBuilder.append(navn);
        stringBuilder.append(" Superhelte Navn: ");
        stringBuilder.append(superhelteNavn);
        stringBuilder.append(" Superkraft: ");
        stringBuilder.append(superkraft);
        stringBuilder.append(" Menneske: ");
        stringBuilder.append(erMenneske);
        stringBuilder.append(" Årstal: ");
        stringBuilder.append(debutÅr);
        stringBuilder.append(" Styrke: ");
        stringBuilder.append(styrke);

        return stringBuilder.toString();
    }
}

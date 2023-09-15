import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public void startProgram() {
        Database database = new Database();
        Controller controller = new Controller(database);

        int brugerValg = 0;
        String navn;
        String superhelteNavn;
        String superKraft;
        String erMenneske;
        int debutÅr;
        int styrke;
        Scanner keyboard = new Scanner(System.in);


        while (brugerValg != 9) {
            System.out.println("""                
                    1. Opret superhelt
                    2. Vis superhelte
                    3. Find superhelt
                    4. Rediger superhelt
                    9. Afslut
                    """);
            brugerValg = keyboard.nextInt();
            if (brugerValg == 1) {
                System.out.println("Din helts civile navn: ");
                navn = keyboard.next();

                System.out.println("Din helts hemmelige identitet: ");
                superhelteNavn = keyboard.next();

                System.out.println("hvad er din helts superkrafter?: ");
                superKraft = keyboard.next();

                System.out.println("Er din helt menneske?: ");
                erMenneske = keyboard.next();

                System.out.println("Hvornår er din helt fra?: ");
                debutÅr = keyboard.nextInt();

                System.out.println("Hvor stærk er din helt?: ");
                styrke = keyboard.nextInt();
                controller.tilføjSuperhelt(navn, superhelteNavn, superKraft, erMenneske, debutÅr, styrke);

            } else if (brugerValg == 2) {
                if (controller.hentSuperhelt().size() == 0)
                    System.out.println("Der er ingen personer i databasen");
                else {
                    System.out.println("Personer i database");
                    for (Superhelt superhelt : controller.hentSuperhelt()) {
                        System.out.println(superhelt);
                    }
                }
            } else if (brugerValg == 3) {
                String find;
                System.out.println("Which superhero are you looking for? ");
                find = keyboard.nextLine();
                controller.findSuperhelte(find);

            } else if (brugerValg == 4) {
                String brugerInput = keyboard.nextLine();

                ArrayList<Superhelt>søgeResultat = database.hentSuperhelt();
                Superhelt superheltDerSkalRedigeres = null;

                if (søgeResultat.size() == 0) {
                    System.out.println("Ingen helte opfylder søgekritirie ");

            } else if (søgeResultat.size() > 1) {
                    System.out.println("Vælg helt ");
                    int tæller = 1;
                    for (Superhelt superhelt: søgeResultat) {
                        System.out.println(tæller++ + " " + superhelt.getNavn() + " " + superhelt.getSuperhelteNavn() + " " + superhelt.getSuperkraft() + " " + superhelt.getErMenneske() + " " + superhelt.getDebutÅr() + " " + superhelt.getStyrke());
                    }
                    int helteValg = keyboard.nextInt();
                    keyboard.nextLine();
                    superheltDerSkalRedigeres = søgeResultat.get(helteValg - 1);
                } else {
                    superheltDerSkalRedigeres = søgeResultat.get(0);
                }
                if (superheltDerSkalRedigeres != null) {
                    System.out.println("Rediger personinformation. Tryk ENTER hvis information ikke skal redigeres. ");
                    String nyVærdi;
                    System.out.println("Navn: " + superheltDerSkalRedigeres.getNavn());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheltDerSkalRedigeres.setNavn(nyVærdi);
                    }
                    System.out.println("Superheltnavn: " + superheltDerSkalRedigeres.getSuperhelteNavn());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheltDerSkalRedigeres.setSuperhelteNavn(nyVærdi);
                    }
                    System.out.println("Superkraft: " + superheltDerSkalRedigeres.getSuperkraft());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheltDerSkalRedigeres.setSuperkraft(nyVærdi);
                    }
                    System.out.println("Menneske status: " + superheltDerSkalRedigeres.getErMenneske());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheltDerSkalRedigeres.setErMenneske(nyVærdi);
                    }
                    System.out.println("Debut År: " + superheltDerSkalRedigeres.getDebutÅr());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheltDerSkalRedigeres.setDebutÅr(Integer.parseInt(nyVærdi));
                    }
                    System.out.println("Styrke niveau: " + superheltDerSkalRedigeres.getStyrke());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheltDerSkalRedigeres.setStyrke(Integer.parseInt(nyVærdi));
                    }
                    System.out.println(superheltDerSkalRedigeres + "er blivet opdateret ");
                }
            } else if (brugerValg == 9) {
            System.out.println("Slukker systemet! ");
            System.exit(0);
            }
        }
    }
}
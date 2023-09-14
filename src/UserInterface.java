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
                System.out.println(controller.hentSuperhelt());
            } else if (brugerValg == 3) {
                String find;
                System.out.println("Hvilken superhelt leder du efter?: ");
                find = keyboard.nextLine();
                controller.findSuperhelte(find);
            } else if (brugerValg == 9) {
                System.out.println("Slukker systemet! ");
                System.exit(0);
            }
        }
    }
}
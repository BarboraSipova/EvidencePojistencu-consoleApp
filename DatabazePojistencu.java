package Craft;
import java.util.Scanner;
/**
 *
 * @author Barbora Šípová
 */
public class DatabazePojistencu { //přejmenovat

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        Databaze databaze = new Databaze();

        String volba = "";
        // hlavní cyklus
        while (!volba.equals("4")) {
            databaze.vypisUvodniObrazovku();
            volba = scanner.nextLine();
            // reakce uživatele na volbu
            switch (volba) {
                case "1" -> databaze.pridejPojistence();
                case "2" -> databaze.vyhledejPojistence();
                case "3" -> databaze.vypisPojistence();
                case "4" -> databaze.vypisRozlouceni();
                default -> System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
            }
        }
    }
}
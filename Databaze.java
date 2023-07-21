package Craft;
import java.util.ArrayList;
import java.util.Scanner;

public class Databaze {
    Scanner scanner = new Scanner(System.in, "Windows-1250");
    private final ArrayList<Osoba> osoby = new ArrayList<>();

    public void pridejPojistence() {
        Osoba osoba = new Osoba();
        osoby.add(osoba);
    }

    /**
     * metoda vyhledávající pojištěnce dle jména a příjmení
     */
    public void vyhledejPojistence() {
        System.out.println("Zadejte jméno pojištěného: ");
        String jmeno = scanner.nextLine().trim().toLowerCase();
        System.out.println("Zadejte příjmení pojištěného: ");
        String prijmeni = scanner.nextLine().trim().toLowerCase();
        //podmínka pro vyhledání osoby v kolekci
        boolean found = false;
        for (Osoba osoba : osoby) {
            if ((osoba.getJmeno().equals(jmeno)) && (osoba.getPrijmeni().equals(prijmeni))) {
                System.out.println(osoba);
                found = true;
                break;
            } else {
                System.out.println("Nenalezeno");
            }
        }
    }

    public void vypisPojistence() {
        if (!osoby.isEmpty()) {
            osoby.forEach(osoba -> System.out.println(osoba));
        } else {
            System.out.println("Nenalezeny žádné údaje.");
        }
    }

    public void vypisUvodniObrazovku() {
        System.out.println();
        System.out.println("========== Evidence pojištěných ==========");
        System.out.println();
        System.out.println("Vyberte si akci: ");
        System.out.println("1 - Přidat pojištěnce");
        System.out.println("2 - Vyhledat pojištěného dle jména");
        System.out.println("3 - Vypsat všechny pojištěné");
        System.out.println("4 - Konec");
        System.out.println();
    }

    public void vypisRozlouceni() {
        System.out.println();
        System.out.println("Děkujeme Vám za použití naší evidence.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Osoba osoba : osoby) {
            sb.append(osoba).append("\n");
        }
        return sb.toString();
    }
}
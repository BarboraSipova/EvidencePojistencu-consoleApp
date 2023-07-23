package Craft;
import java.util.Scanner;

public final class Osoba {
    /**
     * privátní proměnná jméno
     */
    private final String jmeno;
    /**
     * privátní proměnná příjmení
     */
    private final String prijmeni;
    /**
     * privátní proměnná věk
     */
    private int vek;
    /**
     * privátní proměnná telefonní číslo
     */
    private int telefonniCislo;
    /**
     * konstruktor třídy Osoba, obsahující vstupy od uživatele
     */
    public Osoba() {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte své jméno: ");
        this.jmeno = scanner.nextLine().trim().toLowerCase();

        System.out.println("Zadejte své příjmení: ");
        this.prijmeni = scanner.nextLine().trim().toLowerCase();

        setVek(scanner);
        setTelefonniCislo(scanner);

        System.out.println();
        System.out.println("Vaše údaje byly úspěšně uloženy.");
    }
    /**
     * setter pro správné zadání věku
     * @param scanner
     */
    public void setVek(Scanner scanner) {
        System.out.println("Zadejte svůj věk: ");
        try {
            int vek = Integer.parseInt(scanner.nextLine().trim());
            if (vek > 0 && vek < 140) {
                this.vek = vek;
            } else {
                System.out.println("Neplatná hodnota věku. Prosím, zkontrolujte a zadejte znovu.");
                setVek(scanner); // znovuzadání věku ve správném správné hodnotě
            }
        } catch (NumberFormatException e) {
            System.out.println("Neplatný formát věku. Prosím, zkontrolujte a zadejte znovu.");
            setVek(scanner); // znovuzadání věku ve správném formátu
        }
    }
    /**
     * setter pro správné zadání telefonního čísla
     * @param scanner
     */
    public void setTelefonniCislo(Scanner scanner) {
        System.out.println("Zadejte své telefonní číslo: ");
        try {
            int telefonniCislo = Integer.parseInt(scanner.nextLine().trim());
            if (String.valueOf(telefonniCislo).length() <= 12) {
                this.telefonniCislo = telefonniCislo;
            } else {
                System.out.println("Chybná délka telefonního čísla. Prosím, zkontrolujte a zadejte znovu.");
                setTelefonniCislo(scanner); // znovuzdání telefonního čísla ve správné délce
            }
        } catch (NumberFormatException e) {
            System.out.println("Neplatný formát telefonního čísla. Prosím, zkontrolujte a zadejte znovu.");
            setTelefonniCislo(scanner); //znovuzdání telefonního čísla ve správném formátu
        }
    }
    /**
     *getter pro jméno
     * @return jmeno
     */
    public String getJmeno(){
        return jmeno;
    }
    /**
     * getter pro příjmení
     * @return prijmeni
     */
    public String getPrijmeni(){
        return prijmeni;
    }
    /**
     * přepsání údajů metodou toString
     * @return styl výpisu
     */
    @Override
    public String toString(){
        return jmeno + ", " + prijmeni + ", " + vek + ", " + telefonniCislo;
    }
}

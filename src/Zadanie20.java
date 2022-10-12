import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj poczatkowa kwote pieniedzy wplacona na konto oszczednosciowe");
        double oszczednosciowe_poczatkowe = klawiatura.nextDouble();
        System.out.println("podaj roczna stope oprocentowania");
        double stopa_oprocentowania = klawiatura.nextDouble();
        System.out.println("ile razy w roku odsetki sa kapitalizowane");
        double kapitalizacja_odsetek = klawiatura.nextDouble();
        System.out.println("podaj ilosc lat przez ktore kapital bedzie generowal o0dsetki");
        double lata = klawiatura.nextDouble();
        double czynnik=1+stopa_oprocentowania/kapitalizacja_odsetek;
        double kwota_po_kapitalizacji_odsetek=kapitalizacja_odsetek*lata;

    }
}

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args){
       Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj swoje imie: ");
        String imie = klawiatura.nextLine();
        System.out.println("podaj swoje nazwisko: ");
       String nazwisko = klawiatura.nextLine();
       System.out.println("podaj swoj wiek");
       int wiek = klawiatura.nextInt();
       System.out.println("ile chcial bys rabiac rocznie: ");
       double kwota = klawiatura.nextDouble();
       System.out.println("Mam na imie " + imie + " na nazwisko "+ nazwisko +" mam " + wiek + " lat "
               + " i chcial bym zarabiac " + kwota + " rocznie." );




    }
}

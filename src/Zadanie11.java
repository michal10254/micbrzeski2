import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj dystans (Km):  ");
        double paliwo = klawiatura.nextDouble();
        System.out.println("Podaj ilość paliwa (l):  ");
        double dystans = klawiatura.nextDouble();
        double kilometr_na_litzre = dystans/paliwo;
        System.out.println("litry na kilometr: " + kilometr_na_litzre);

    }
}

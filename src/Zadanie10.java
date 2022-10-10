import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args){
        double podatek,kwota_bez_podatku;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj kwote: ");
        double kwota = klawiatura.nextDouble();
        podatek = kwota *0.06;
        kwota_bez_podatku = kwota - podatek;
        System.out.println(podatek);
        System.out.println(kwota_bez_podatku);

    }
}

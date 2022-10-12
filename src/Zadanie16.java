import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj cene posilku wraz z napiwkiem: ");
        double cena = klawiatura.nextDouble();
        double podatek = cena * 0.0675;
        double napiwek = cena * 0.2;
        double cena_samego_posilku = cena-napiwek-podatek;
        System.out.println(cena);
        System.out.println(podatek);
        System.out.println(napiwek);
        System.out.println(cena_samego_posilku);


    }
}

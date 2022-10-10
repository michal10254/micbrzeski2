import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj ilosc ciastek");
        double ciastka = klawiatura.nextDouble();
        double pudelko= ciastka/40;
                double porcja = ciastka/10;
        System.out.println("jedno pudelko ciastek");
    }
}

import java.util.Scanner;

public class Zadanie19 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj ile ciastek chciual bys zrobic: ");
        double ciastka = klawiatura.nextDouble();
        double cukier = 0.3*ciastka;
        double maslo = 0.2*ciastka;
        double maka = 0.5* ciastka;
        System.out.println(cukier);
        System.out.println(maslo);
        System.out.println(maka);

    }
}

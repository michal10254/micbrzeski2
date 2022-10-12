import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double cena_akcji_z_prowizja = 600*21.77;
        double prowizja = cena_akcji_z_prowizja*0.02;
        double cena_akcji_bez_prowizji = cena_akcji_z_prowizja-prowizja;
        System.out.println("calkowita cena akcji: " + cena_akcji_z_prowizja);
        System.out.println("cena akcji bez prowizji: "+ cena_akcji_bez_prowizji);
        System.out.println("wysokosc prowizji: "+ prowizja);
    }
}

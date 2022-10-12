import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj nazwe swojego ulubionego miasta");
        String miasto = klawiatura.nextLine();
        int length;
        char inicjal;
        length = miasto.length();
        System.out.println("nazwa misata ma: "+ length + " liter");
        String male,duze;
        duze = miasto.toUpperCase();
        male = miasto.toLowerCase();
        inicjal = miasto.charAt(0);
        System.out.println(duze);
        System.out.println(male);
        System.out.println(inicjal);


    }
}

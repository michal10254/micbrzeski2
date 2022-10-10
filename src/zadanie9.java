import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj imie: ");
        String FirstName= klawiatura.nextLine();
        System.out.println("podaj drugieimie");
        String middleName = klawiatura.nextLine();
        System.out.println("podaj nazwisko");
        String lastName = klawiatura.nextLine();
        char inicjal1 =FirstName.charAt(0);
        char inicjal2 =middleName.charAt(0);
        char inicjal3 =lastName.charAt(0);
        System.out.println(FirstName);
                System.out.println(middleName);
                    System.out.println(lastName);
                    System.out.println(inicjal1 + ""+ inicjal2 + ""+ inicjal3);


    }
}

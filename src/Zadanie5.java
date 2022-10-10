public class Zadanie5 {
    public static void main(String[] args) {
        int wymiar1pokuj1 = 3;
        int wymiar2pokuj1 = 4;
        int wymiar1pokuj2 = 3;
        int wymiar2pokuj2 = 4;
        int wymiar1pokuj3 = 2;
        int wymiar2pokuj3 = 3;
        int wymiar1pokuj4 = 2;
        int wymiar2pokuj4 = 2;


     double pokoje;
     int pokuj1 = wymiar1pokuj1*wymiar2pokuj1;
     int pokuj2 = wymiar1pokuj2*wymiar2pokuj2;
     int pokuj3 = wymiar1pokuj3*wymiar2pokuj3;
     int pokuj4 = wymiar1pokuj4*wymiar2pokuj4;
     int powieszchnia_calkowita = pokuj1+pokuj2+pokuj3+pokuj4;
     System.out.println("wymieary pomieszczenia 1: " + pokuj1);
        System.out.println("wymieary pomieszczenia 2: " + pokuj2);
        System.out.println("wymieary pomieszczenia 3: " + pokuj3);
        System.out.println("wymieary pomieszczenia 4: " + pokuj4);
        System.out.println("powieszchnia calkowita pomieszczen: " + powieszchnia_calkowita);
        double powieszchnia_na_osobe;
        powieszchnia_na_osobe = (double)powieszchnia_calkowita/4;
                System.out.println("powieszchnia przypadajaca na osobe jest rowna: " + powieszchnia_na_osobe);
    }
}

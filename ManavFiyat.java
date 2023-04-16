import java.util.Scanner;

public class ManavFiyat {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        JAVA İLE KULLANICILARIN MANAVDAN ALMIŞ OLDUKLARI ÜRÜNLERİN KİLOGRAM DEĞERLERİNE GÖRE TOPLAM TUTARINI EKRANA YAZAN PROGRAM
        */

        System.out.println("""
                ***MANAV FİYAT LİSTESİ***
                    Salatalık : 3,14 TL
                    Elma : 4,11 TL
                    Kabak : 2,22 TL
                    Domates: 0,95 TL
                    Patlıcan : 7,00 TL
                """);
        double salatalik = 3.14;
        double elma = 4.11;
        double kabak = 2.22;
        double domates = 0.95;
        double patlican = 7.00;

        System.out.println("Kaç kilo salatalık ?");
        int k1 = klavye.nextInt();
        salatalik = salatalik*k1;
        System.out.println("Kaç kilo elma ?");
        int k2 = klavye.nextInt();
        elma = elma*k1;
        System.out.println("Kaç kilo kabak ?");
        int k3 = klavye.nextInt();
        kabak = kabak*k1;
        System.out.println("Kaç kilo domates ?");
        int k4 = klavye.nextInt();
        domates = domates*k4;
        System.out.println("Kaç kilo patlıcan ?");
        int k5 = klavye.nextInt();
        patlican = patlican*k1;

        double total = elma+domates+salatalik+kabak+patlican;

        System.out.println("Toplam fiyat : "+total+ " TL");
    }
}

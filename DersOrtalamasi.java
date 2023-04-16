import java.util.Scanner;

public class DersOrtalamasi {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        * JAVA İLE FİZİK MATEMATİK TÜRKÇE KİMYA MÜZİK TARİH DERSLERİNİN SINAV PUANLARINI KULLANICIDAN
        * ALAN VE BU DERSLERİN ORTALAMALARINI HESAPLAYIP EKRANA BASTIRAN PROGRAM
        */
        System.out.println("Lütfen fizik dersi notunuzu giriniz : ");
        int fizik = klavye.nextInt();
        System.out.println("Lütfen matematik dersi notunuzu giriniz : ");
        int matematik = klavye.nextInt();
        System.out.println("Lütfen turkce dersi notunuzu giriniz : ");
        int turkce = klavye.nextInt();
        System.out.println("Lütfen kimya dersi notunuzu giriniz : ");
        int kimya = klavye.nextInt();
        System.out.println("Lütfen muzik dersi notunuzu giriniz : ");
        int muzik = klavye.nextInt();
        System.out.println("Lütfen tarih dersi notunuzu giriniz : ");
        int tarih = klavye.nextInt();
        int dersOrtalamasi = (fizik+matematik+turkce+kimya+muzik+tarih)/6;
        System.out.println("Girdiginiz derslerin ortalamasi : "+dersOrtalamasi);

    }
}
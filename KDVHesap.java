import java.util.Scanner;

public class KDVHesap {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        KULLANICIDAN ALINAN FİYATIN KDV'SİNİ HESAPLAYIP KULLANICININ GİRDİĞİ TUTARAK EKLEYIP EKRANA BASAN PROGRAM
        KDV ORANI = 18/100
        */
        System.out.println("Fiyat giriniz : ");
        double fiyat = klavye.nextDouble();
        double kdv = (fiyat*18)/100;
        double kdvFiyat = fiyat + kdv;
        System.out.println("KDV'li fiyatınız : "+kdvFiyat);
    }
}

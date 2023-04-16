import java.util.Scanner;

public class BasitHesapMakinesi {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        KULLANICININ GİRDİĞİ 2 SAYIYI YİNE KULLANICININ SEÇTİĞİ 4 İŞLEMDEN BİRİNİ YAPIP EKRANA BASAN PROGRAM
         */
        System.out.println("""
                1 - TOPLAMA
                2 - ÇIKARMA
                3 - ÇARPMA
                4 - BOLME
                """);
        System.out.println("İlk sayıyı giriniz : ");
        int sayi1 = klavye.nextInt();
        System.out.println("Ikinci sayıyı giriniz : ");
        int sayi2 = klavye.nextInt();
        System.out.println("Yapmak istediginiz işlem no : ");
        int islemNo = klavye.nextInt();
        switch (islemNo){
            case 1:
                System.out.println("Toplam : "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Fark : "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpım : "+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bölüm : "+(sayi1/sayi2));
                break;
            default:
                System.out.println("Hatalı Giriş!!!");
        }

    }
}

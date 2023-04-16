import java.util.Scanner;

public class TaksimetreTutari {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        JAVA İLE GİDİLEN KİLOMETRE KADAR TAKSİMETRE TUTARI HESAPLAMA
        Taksimetre kilometre başına 2.20 TL tutmaktadır.
        Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */

        int acilis = 10;
        double kilometreFiyat = 2.20;
        System.out.println("Kaç kilometre ? : ");
        int km = klavye.nextInt();
        double tutar = acilis+(kilometreFiyat*km);
        if (tutar<20){
            System.out.println("Kısa mesafe tutarı 20 TL");
        }else{
            System.out.println("Borcunuz : "+tutar);
        }

    }
}

import java.util.Scanner;

public class DaireCevreAlanHesaplama {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        JAVA İLE KULLANICIDAN ALINAN YARICAP BİLGİSİ İLE BİR DAİRENİN HEM CEVRESİNİ HEM DE ALANINI HESAPLAYIP EKRANA YAZAN PROGRAM
        Daire Alan Formülü : π * r * r
        Daire Çevre Formülü : 2 * π * r
         */
        System.out.println("Dairenin yaricapini giriniz : ");
        double yaricap = klavye.nextDouble();
        double pi = Math.PI;
        double daireAlan = pi*Math.pow(yaricap,2);
        double daireCevre = 2*pi*yaricap;
        System.out.println("Dairenin Alanı : "+daireAlan+" Cevresi : "+daireCevre);

    }
}

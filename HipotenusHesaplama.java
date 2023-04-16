
import java.util.Scanner;

public class HipotenusHesaplama {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        /*
         * KULLANICIDAN ALINAN DİK KENARLAR İLE HİPOTENUS HESAPLAMA
         */
        System.out.println("1.Dik kenar uzunlugu : ");
        double kenar1 = klavye.nextDouble();
        System.out.println("2.Dik kenar uzunlugu : ");
        double kenar2 = klavye.nextDouble();

        double hipotenus = Math.pow(kenar1,2)+Math.pow(kenar2,2);
        System.out.println("Hipotenus : "+Math.sqrt(hipotenus));


    }
}

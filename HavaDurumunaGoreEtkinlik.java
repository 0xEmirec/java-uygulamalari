import java.util.Scanner;

public class HavaDurumunaGoreEtkinlik {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Java ile kullanıcının girdiği sıcaklık durumuna göre aşağıda ki etkinlikleri öneren programı yazınız.
         */
        System.out.println("Hava kaç derece ? : ");
        int derece = klavye.nextInt();
        if (derece<=5){
            System.out.println("Bu havada kayak güzel olur.");
        }else if (derece>5 && derece <=15){
            System.out.println("Hadi tiyatroya gidelim.");
        }else if (derece>15 && derece<=25){
            System.out.println("Hadi mangal yapalım.");
        }else{
            System.out.println("Bu havada yüzmek güzel olur.");
        }
    }
}

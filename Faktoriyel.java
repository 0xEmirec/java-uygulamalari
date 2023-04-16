import java.util.Scanner;

public class Faktoriyel {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Faktoriyelini hesaplamak istediginiz sayıyı giriniz : ");
        int sayi = klavye.nextInt();
        int faktoriyel = 1;
        while (sayi>0){
            faktoriyel*=sayi;
            sayi--;
        }
        System.out.println("Sonuç : "+faktoriyel);
    }
}

import java.util.Scanner;

public class VucutKutleIndeks {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        KULLANICIDAN ALINAN KİLO VE BOY DEGERLERİNE GORE FORMULLE VUCUT KITLE INDEKSI HESAPLAMA
        Formül : Kilo (kg) / Boy(m) * Boy(m)
        18.5'ten küçükse ekrana "Zayıf"
        18.5 ile 24.9 arasında ise ekrana "İdeal"
        25 ile 29.9 arasında ise ekrana "Şişman"
        30 ile 34.9 arasında ise ekrana "Obez"
        35'ten büyükse ise ekrana "Aşırı Obez" yazsın.
        */
        System.out.println("Lütfen boyunuzu giriniz (cm cinsinden): ");
        double boy = klavye.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo = klavye.nextDouble();
        boy = boy/100;
        double vucutKitleIndeks = kilo/Math.pow(boy,2);
        System.out.println(vucutKitleIndeks);
        if (vucutKitleIndeks<=18.5){
            System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleIndeks+"\tDegerlendirme : Zayıf");
        }else if (vucutKitleIndeks>18.5 && vucutKitleIndeks<= 25){
            System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleIndeks+"\tDegerlendirme : İdeal");
        }else if (vucutKitleIndeks>25 && vucutKitleIndeks<=30){
            System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleIndeks+"\tDegerlendirme : Şişman");
        }else if (vucutKitleIndeks>30 && vucutKitleIndeks<35){
            System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleIndeks+"\tDegerlendirme : Obez");
        }else{
            System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleIndeks+"\tDegerlendirme : Aşırı Obez");
        }

    }
}

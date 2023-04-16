import java.util.Scanner;

public class VucutKutleIndeks {
    static Scanner klavye = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        KULLANICIDAN ALINAN KİLO VE BOY DEGERLERİNE GORE FORMULLE VUCUT KITLE INDEKSI HESAPLAMA
        Formül : Kilo (kg) / Boy(m) * Boy(m)
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

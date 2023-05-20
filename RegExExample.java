package IleriSeviyeJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
    public static void main(String[] args) {
        Pattern pattern;
        Matcher matcher;
        String regExPattern;
        String text;
        Scanner klavye = new Scanner(System.in);

        while (true){
            System.out.println("Bir RegEx modeli giriniz : ");
            regExPattern = klavye.nextLine();

            pattern = Pattern.compile(regExPattern);
            System.out.println("Bir metin giriniz : ");
            text = klavye.nextLine();

            matcher = pattern.matcher(text);

            while (matcher.find()){
                System.out.println("Baslangic indeksi : "+matcher.start());
                System.out.println("Bitis indeksi : "+matcher.end());
                System.out.println("Bulunan metin : "+matcher.group()+"-");
            }
        }
    }
}

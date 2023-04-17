package GiseApp;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("*** Gişe Uygulamasına Hoşgeldiniz! ***");
        System.out.println("Lütfen TCKN giriniz : ");
        String tckn = klavye.nextLine();
        TCKN tcknNesne = new TCKN();
        tcknNesne.setTckn(tckn);

    }
}

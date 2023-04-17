package GiseApp;

import java.util.Random;

public class TCKN {
    private String tckn;
    boolean kontrol = true;

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        if (tckn.length()==11){
            for (int i=0;i<tckn.length();i++){
                char karakter = tckn.charAt(i);
                if (Character.isDigit(karakter)){
                    kontrol=true;
                }
                else{
                    kontrol=false;
                }
            }
            if (kontrol){
                Random random = new Random();
                int giseNo= random.nextInt(100);
                System.out.println("Gişe No : "+giseNo);
            }else{
                System.out.println("TCKN harf içermemelidir!");
            }
        }else{
            hataYazdir("TCKN 11 karakter olmak zorundadır!");
        }
    }
    public void hataYazdir(String hata){
        System.out.println(hata);
    }
}

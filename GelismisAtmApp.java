import java.util.Scanner;

public class GelismisAtmApp {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        // Emir IBAN TR1234 000 521 365 325 8964 25 14
        // Mavi IBAN TR4567 895 258 654 147 8965 74 89
        // emirec:password123
        // mavi:mavi123

        String menu = """
                1 - Bakiye Görüntüle
                2 - Para Çek
                3 - Farklı bir hesaba para yatırmak için
                4 - Uygulamadan çıkmak için q'ye basınız
                """;
        double emirBakiye = 2450;
        String emirIBAN = "TR1234 000 521 365 325 8964 25 14";
        String emirKullaniciAdi = "emirec";
        String emirSifre = "password123";

        double maviBakiye = 1245;
        String maviIBAN = "TR4567 895 258 654 147 8965 74 89";
        String maviKullaniciAdi = "mavi";
        String maviSifre = "mavi123";

        System.out.println("ATM'ye Hoşgeldiniz!\nLütfen bilgilerinizi giriniz.");
        System.out.println("Kullanıcı adı : ");
        String kullaniciAdi = klavye.nextLine();
        System.out.println("Şifre : ");
        String sifre = klavye.nextLine();

        if (kullaniciAdi.equals(emirKullaniciAdi) && sifre.equals(emirSifre)){
            System.out.println("Hoşgeldiniz Emir Bey");
            System.out.println(menu);
            System.out.println(menu);
            System.out.println("Seçiminiz : ");
            String secim = klavye.nextLine();
            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz : " + emirBakiye);
                    break;
                case "2":
                    System.out.println("Ne kadar para çekmek istiyorsunuz ?:");
                    int miktar = klavye.nextInt();
                    if (emirBakiye >= miktar) {
                        emirBakiye -= miktar;
                        System.out.println("Çekmek istediğiniz tutar : " + miktar + "\nBakiyeniz : " + emirBakiye);
                    } else {
                        System.out.println("Bakiyeniz yetersiz..");
                    }
                    break;
                case "3":
                    System.out.println("Ne kadar para yatırmak istiyorsunuz ?:");
                    int miktar2 = klavye.nextInt();
                    if (emirBakiye >= miktar2) {
                        klavye.nextLine();
                        System.out.println("Para yatırmak istediginiz IBAN'ı giriniz : ");
                        String iban = klavye.nextLine();
                        if (iban.equals(maviIBAN)) {
                            emirBakiye -= miktar2;
                            maviBakiye += miktar2;
                            System.out.println("Paranız mavi kullanıcısının hesabına gönderildi!\nBakiyeniz : " + emirBakiye);
                        } else {
                            System.out.println("Hatalı IBAN!");
                        }
                    } else {
                        System.out.println("Bakiyeniz yetersiz!");
                    }
                    break;
                case "q":
                    System.out.println("Çıkış yapılıyor....");
                    break;
            }
        } else if (kullaniciAdi.equals(maviKullaniciAdi) && sifre.equals(maviSifre)) {
            System.out.println("Hoşgeldiniz Mavi Hanım");
            System.out.println(menu);
            System.out.println("Seçiminiz : ");
            String secim = klavye.nextLine();
            switch (secim){
                case "1":
                    System.out.println("Bakiyeniz : "+maviBakiye);
                    break;
                case "2":
                    System.out.println("Ne kadar para çekmek istiyorsunuz ?:");
                    int miktar = klavye.nextInt();
                    if (maviBakiye>=miktar){
                        maviBakiye-=miktar;
                        System.out.println("Çekmek istediğiniz tutar : "+miktar+"\nBakiyeniz : "+maviBakiye);
                    }else{
                        System.out.println("Bakiyeniz yetersiz..");
                    }
                    break;
                case "3":
                    System.out.println("Ne kadar para yatırmak istiyorsunuz ?:");
                    int miktar2 = klavye.nextInt();
                    if (maviBakiye>=miktar2){
                        klavye.nextLine();
                        System.out.println("Para yatırmak istediginiz IBAN'ı giriniz : ");
                        String iban = klavye.nextLine();
                        if (iban.equals(emirIBAN)){
                            maviBakiye-=miktar2;
                            emirBakiye+=miktar2;
                            System.out.println("Paranız emirec kullanıcısının hesabına gönderildi!\nBakiyeniz : "+maviBakiye);
                        }else{
                            System.out.println("Hatalı IBAN!");
                        }
                    }else{
                        System.out.println("Bakiyeniz yetersiz!");
                    }
                    break;
                case "q":
                    System.out.println("Çıkış yapılıyor....");
                    break;
            }
        }else{
            System.out.println("Kullanıcı adı veya parola yanlış! Lütfen tekrar deneyiniz!");
        }

    }
}

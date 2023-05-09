package DosyaIslemleri;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Downloader {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        //https://example-files.online-convert.com/document/txt/example.txt >> EXAMPLE URL
        System.out.println("Indirmek istediğiniz dosyanın url'sini girin : ");
        String urlClient = klavye.nextLine();
        try {
            URL url = new URL(urlClient);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            char[] buffer = new char[1024];
            // BURADA DOSYAYI KAYDETMEK İÇİN O ANKİ ZAMANI KULLANIYOR
            FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(System.currentTimeMillis()));
            int length=0;
            while ((length=inputStreamReader.read(buffer)) != -1){
                fileOutputStream.write(new String(Arrays.copyOfRange(buffer,0,length)).getBytes());
            }
            inputStreamReader.close();
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

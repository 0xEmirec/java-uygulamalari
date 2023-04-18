package ArrayListKullanimi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_Iterator_Kullanimi {
    public static void main(String[] args) {

        // ARRAYLİST - ITERATOR KULLANIMI
        Scanner klavye = new Scanner(System.in);

        Ogrenci ogr1 = new Ogrenci(1,"Emir");
        Ogrenci ogr2 = new Ogrenci(2,"Mavi");
        Ogrenci ogr3 = new Ogrenci(3,"Sıla");

        ArrayList<Ogrenci> ogrenciler=new ArrayList<>();

        ogrenciler.add(ogr1);
        ogrenciler.add(ogr2);
        ogrenciler.add(ogr3);

        listeGoster(ogrenciler);

        Ogrenci ogr4 = new Ogrenci(4,"Aslı");

        ogrenciEkle(ogrenciler,ogr4);
        listeGoster(ogrenciler);
        Ogrenci ogr8 = new Ogrenci(8,"Nazlı");
        ogrenciSil(ogrenciler,ogr2);
        listeGoster(ogrenciler);

    }
    public static void listeGoster(ArrayList<Ogrenci> liste){
        Iterator iterator = liste.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void ogrenciEkle(ArrayList<Ogrenci> ogrAday,Ogrenci ogrenci){
        ogrAday.add(ogrenci);
        System.out.println("Öğrenci Eklendi..");
    }
    public static void ogrenciSil(ArrayList<Ogrenci> ogrAday,Ogrenci ogrenci){
        boolean kontrol=false;
        Iterator iterator = ogrAday.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == ogrenci){
                iterator.remove();
                kontrol=true;
            }
        }
        if (kontrol) System.out.println("Öğrenci silindi!");
        else System.out.println("Öğrenci listede yok!");

    }
}

class Ogrenci{
    private int okulNo;
    private String name;

    public Ogrenci(int okulNo, String name) {
        this.okulNo = okulNo;
        this.name = name;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNo=" + okulNo +
                ", name='" + name + '\'' +
                '}';
    }
}
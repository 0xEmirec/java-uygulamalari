public class PolimorfizmKullanimi {
    public static void main(String[] args) {
        Sekil sekil = new Sekil();
        sekil.alanHesapla();
        sekil.cevreHesapla();

        Sekil kare = new Kare(5);
        kare.alanHesapla();
        kare.cevreHesapla();

        Sekil dikdortgen = new Dikdortgen(2,3);
        dikdortgen.cevreHesapla();
        dikdortgen.alanHesapla();

        Sekil daire = new Daire(8);
        daire.alanHesapla();
        daire.cevreHesapla();
    }
}

class Sekil{
    public void alanHesapla(){
        System.out.println("Alan hesaplanamaz!");
    }
    public void cevreHesapla(){
        System.out.println("Alan hesaplanamaz!");
    }
}

class Kare extends Sekil{
    private int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public void alanHesapla() {
        System.out.println("Kare'nin Alanı : "+(Math.pow(getKenar(),2)));
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Kare'nin Çevresi : "+(4*getKenar()));
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }
}

class Dikdortgen extends Sekil{
    private int kenar1;
    private int kenar2;

    public Dikdortgen(int kenar1, int kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dikdörtgen'in Çevresi : "+(2*(getKenar1()+getKenar2())));
    }

    @Override
    public void alanHesapla() {
        System.out.println("Dikdörtgen'in Alanı : "+(getKenar1()*getKenar2()));
    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }
}

class Daire extends Sekil{
    private int r;

    public Daire(int r) {
        this.r = r;
    }

    @Override
    public void alanHesapla() {
        System.out.println("Daire'nin Alanı : "+(Math.PI*Math.pow(r,2)));
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Daire'nin Çevresi : "+(2*Math.PI*r));
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
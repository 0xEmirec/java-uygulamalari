import java.util.Arrays;

public class CiftSayilar {
    public static void main(String[] args) {
        int[] ciftSayilar = CiftSayilar.ciftSayilar(new int[]{1,2,3,4,5,6});
        System.out.println(Arrays.toString(ciftSayilar));
    }
    public static int[] ciftSayilar(int[] dizi){
        int[] dizi2=null;
        int adet=0;
        for (int i=0;i<dizi.length;i++){
            if (dizi[i]%2==0){
                adet++;
            }
        }
        dizi2 = new int[adet];
        int index=0;
        for (int i=0;i<dizi.length;i++){
            if (dizi[i]%2==0){
                dizi2[index++]=dizi[i];
            }
        }
        return dizi2;
    }
}

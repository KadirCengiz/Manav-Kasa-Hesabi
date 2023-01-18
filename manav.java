import java.util.Scanner;
public class manav {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması.

        double armut,elma,domates,muz,patlican,toplamTutar;

        //Meyve kilolarının girilmesi.

        Scanner gir=new Scanner(System.in);

        System.out.print("Armut kilogramını gir: ");
        armut= gir.nextDouble();

        System.out.print("Elma kilogramını gir: ");
        elma= gir.nextDouble();

        System.out.print("Domates kilogramını gir: ");
        domates= gir.nextDouble();

        System.out.print("Muz kilogramını gir: ");
        muz= gir.nextDouble();

        System.out.print("Patlıcan kilogramını gir: ");
        patlican= gir.nextDouble();

        //Toplam turarın hesaplanması.

        toplamTutar=(armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.0);
        System.out.println("Toplam tutar: " +toplamTutar);
    }
}
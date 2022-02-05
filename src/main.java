import java.util.Scanner ;

public class main {
    public static void main(String[] args) {
        double tutar, kdv1Oran = 0.18 , kdv2Oran = 0.08, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();
        boolean kdvOrani = (tutar < 1000);
        double bindenKucuk = tutar + tutar * kdv1Oran;
        double bindenBuyuk = tutar + tutar * kdv2Oran;
        kdvliTutar = (kdvOrani) ? bindenKucuk : bindenBuyuk ;

        System.out.println("KDV'li Tutar : " + kdvliTutar);

        double kdv = (kdvOrani) ? kdv1Oran  : kdv2Oran  ;

        System.out.println("KDV Oranı : " + kdv );

        double kdvTutari = (kdvOrani) ? tutar * kdv1Oran  : tutar * kdv2Oran ;

        System.out.println("KDV Tutarı : " + kdvTutari );

        kdvliTutar= tutar + kdvTutari;
        System.out.println("Kdv'siz Tutar : " + tutar);
        System.out.println("Kdv'li Tutar : " + kdvliTutar);
    }


}

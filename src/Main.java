import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi ;
        double ucret;

        Scanner input = new Scanner(System.in);
        System.out.print(" Mesafeyi km turunden giriniz: " );
        mesafe = input.nextInt();

        System.out.print("Yasinizi giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz. (1 = tek yon. 2 = cift yon) : ");
        yolculukTipi = input.nextInt();

        ucret = mesafe * 0.10 ;

        if( yas<=0 || mesafe<=0 || (yolculukTipi != 1 && yolculukTipi != 2 )) {
            System.out.println("Hatali veri girdiniz.");
        }else{
            if ( yas < 12 ) {
                ucret *= 0.5;
            } else if (yas>12 && yas<24) {
                ucret *= 0.9;
            } else if ( yas>65 ) {
                ucret *= 0.7;
            }
            if ( yolculukTipi == 2){
                ucret *= 0.8 * 2;
            }

            System.out.println("Toplam Bilet Fiyati: " +ucret+ "TL" );
        }

    }
}
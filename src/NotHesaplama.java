import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {

        /* Aldığımız notlar ondalıklı sayı olabilir(sözlüler falan girilince)
        o yüzden ifadeleri tanımlarken int yerine float kullandım */

        float a, b, c, d, e, f;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu yazınız:");
        a = input.nextFloat();

        System.out.print("Fizik notunuzu yazınız:");
        b = input.nextFloat();

        System.out.print("Kimya notunuzu yazınız:");
        c = input.nextFloat();

        System.out.print("Türkçe notunuzu yazınız:");
        d = input.nextFloat();

        System.out.print("Tarih notunuzu yazınız:");
        e = input.nextFloat();

        System.out.print("Müzik notunuzu yazınız:");
        f = input.nextFloat();

        float sonuc = (a+b+c+d+e+f)/6;
        System.out.println("Not ortalamanız = " + sonuc );

        boolean genelSonuc = (sonuc>=60) ;
        String finish = genelSonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(finish);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armutTl = 2.14, elmaTl=3.67, domatesTl= 1.11, muzTl=0.95, patlicanTl = 5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double toplam, toplamArmut, toplamElma, toplamDomates, toplamMuz, toplamPatlican;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız : ");
        armutKg = inp.nextDouble();
        toplamArmut = armutKg * armutTl;

        System.out.println("Kaç kilo elma aldınız : ");
        elmaKg = inp.nextDouble();
        toplamElma = elmaKg * elmaTl;

        System.out.println("Kaç kilo domates aldınız : ");
        domatesKg = inp.nextDouble();
        toplamDomates = domatesKg * domatesTl;

        System.out.println("Kaç kilo muz aldınız : ");
        muzKg = inp.nextDouble();
        toplamMuz = muzKg * muzTl;

        System.out.println("Kaç kilo patlıcan aldınız : ");
        patlicanKg = inp.nextDouble();
        toplamPatlican = patlicanKg * patlicanTl;

        toplam = toplamArmut + toplamMuz + toplamDomates + toplamPatlican + toplamElma;

        System.out.print("Ödeyeceğiniz toplam tutar : " + toplam);
    }
}
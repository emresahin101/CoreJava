package javaders.day04memorykullanimiwrapperclass;
import java.util.Scanner;
public class C01_Scanner {
    // Kullanicidan aldiginiz 5 basamakli
    // bir sayinin ilk 2 ve son 2 basamagindaki
    // sayilarin toplamini yazdiran kodu olusturunuz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz...");
        int number = input.nextInt();//38671

        // Son rakami al
        int lastDigit = number%10;//1
        // Sayiyi kucult
        number=number/10;//3867

        // Sondan ikinci rakami al
        int lastSeconDigit=number%10;//7
        number=number/10;//386

        //Sondan ucuncu rakami al
        int lastThirdDigit=number%10;//6
        number=number/10;

        //Sondan dorduncu rakami al
        int lastFourthDigit=number%10;//8
        number=number/10;

        //Sondan besinci rakami al
        int lastFifthDigit=number%10;//3
        System.out.println(lastFifthDigit+lastFourthDigit+lastSeconDigit+lastDigit);





    }//main
}//class

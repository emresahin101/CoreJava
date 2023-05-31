package practices.day18practice;

import java.util.Scanner;

public class C01_IllegalArgumentException {
    /* Kullanıcıdan yasını sisteme girmesini isteyiniz.
          Kullanıcı yas olarak 0'dan kucuk esit veya
          120'den buyuk esit bir sayı girerse
          IllegalArgumentException olusacak sekilde
          bir program yazınız
           */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi Giriniz");
        int yas = scan.nextInt();
        if(yas<=0 || yas>=120){
            throw new IllegalArgumentException(); //Exception throw ettikten sonra orada kod okuması durur.Bu bizim kendi çıkardığımız exception.
            // Java bizim istedigimiz durumlarda exception fırlatabilir.
        }else{
            System.out.println("Uygun Bir Yas Girdiniz");
        }
    }
}


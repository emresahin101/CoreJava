package practices.day09practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Method {


    public static void main(String[] args) {

        /*

        kullanıcıdan bir cumle sisteme girmesini isteyiniz.
        method olusturarak cumlede gecen sesli harfleri konsola yazdırınız

     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir cumle giriniz");
        String cumle = scan.nextLine();

        System.out.println(cumle);


        String arr[]=cumle.split("");


        System.out.println(Arrays.toString(arr));


        sesliharfleriyazdir(arr);




    }

    public static void sesliharfleriyazdir(String[] arr) {


        for (int i = 0; i <arr.length ; i++) { // aray'in uzunluguna kadar donguye aldık

            if(arr[i].equalsIgnoreCase("a") // array elemanları sesli harf mi kontrol ettik
                    || arr[i].equalsIgnoreCase("e")
                    || arr[i].equalsIgnoreCase("i")
                    || arr[i].equalsIgnoreCase("o")
                    || arr[i].equalsIgnoreCase("u")){

                System.out.print(arr[i]); // sesli harf olanları yazdırdık
            }


        }










    }
}


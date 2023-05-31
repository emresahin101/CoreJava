package javaders.day03methodcreationscanner;
import java.util.Scanner;
public class C01_KullanicidanDataAlma {

    public static void main(String[] args) {

        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir character veriniz");
        char ch = input.next().charAt(0);//talip
        System.out.println("  "+ch+"  ");//5 karakter
        System.out.println(" "+ch+" "+ch+" ");//5 karakter
        System.out.println(ch+" "+ch+" "+ch);//5 karakter

        // Aralarinda bir tab bosluk birakarak tek sout ile ayni sekli olusturalim

        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t" +
                "\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);


        /*
       Sadece char  data type icin nextChar()
       diye bir method olmadigi icin kullanicidan
       data alip ch konteyner'ina yerlestirmek icin next().charAt(0);
       methodunu kullaniriz
         */



    }//main
}//class